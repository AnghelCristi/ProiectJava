package com.example.JavaProject.model;

import javax.persistence.*;

@Entity
@Table(name = "localitati")
public class Localitati {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idLocalitate")
    private long idLocalitate;

    @Column(name = "numeLocalitate",nullable = false, unique = true)
    private String numeLocalitate;

    @ManyToOne
    @JoinColumn(name = "idTara")
    private Tari tari;

    @ManyToOne
    @JoinColumn(name = "idRegiune")
    private Regiuni regiuni;

    public Localitati() {
    }

    public Localitati(String numeLocalitate, Tari tari, Regiuni regiuni) {
        this.numeLocalitate = numeLocalitate;
        this.tari = tari;
        this.regiuni = regiuni;
    }

    public Long getTara() {
        return tari.getIdTara();
    }

    public String getNumeTara() {
        return tari.getNumeTara();
    }

    public Long getRegiune() {
        return regiuni.getIdRegiune();
    }

    public String getNumeRegiune() {
        return regiuni.getNumeRegiune();
    }

    public String getNumeLocalitate() {
        return numeLocalitate;
    }

    public void setNumeLocalitate(String numeLocalitate) {
        this.numeLocalitate = numeLocalitate;
    }

    public long getIdLocalitate() {
        return idLocalitate;
    }


}
