package com.example.JavaProject.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "regiuni")
public class Regiuni {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idRegiune")
    private long idRegiune;

    @Column(name = "numeRegiune",nullable = false, unique = true)
    private String numeRegiune;

    @ManyToOne
    @JoinColumn(name = "idTara")
    private Tari tari;

    @OneToMany(mappedBy = "regiuni")
    private List<Localitati> localitati;

    public Regiuni() {
    }

    public Regiuni(long idRegiune, String numeRegiune, Tari tari, List<Localitati> localitati) {
        this.idRegiune = idRegiune;
        this.numeRegiune = numeRegiune;
        this.tari = tari;
        this.localitati = localitati;
    }

    public List<Localitati> getLocalitati() {
        return localitati;
    }

    public Long getTara() {
        return tari.getIdTara();
    }

    public String getNumeTara() {
        return tari.getNumeTara();
    }

    public String getNumeRegiune() {
        return numeRegiune;
    }

    public void setNumeRegiune(String numeRegiune) {
        this.numeRegiune = numeRegiune;
    }

    public long getIdRegiune() {
        return idRegiune;
    }


}
