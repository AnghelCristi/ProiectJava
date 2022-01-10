package com.example.JavaProject.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tari")
public class Tari {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTara")
    private long idTara;

    @Column(name = "numeTara", nullable = false, unique = true)
    private String numeTara;

    @OneToMany(mappedBy = "tari")
    private List<Regiuni> regiuni;

    @OneToMany(mappedBy = "tari")
    private List<Localitati> localitati;

    public Tari() {
    }

    public Tari(long idTara, String numeTara, List<Regiuni> regiuni, List<Localitati> localitati) {
        this.idTara = idTara;
        this.numeTara = numeTara;
        this.regiuni = regiuni;
        this.localitati = localitati;
    }

    public String getNumeTara() {
        return numeTara;
    }

    public void setNumeTara(String numeTara) {
        this.numeTara = numeTara;
    }

    public long getIdTara() {
        return idTara;
    }

    public List<Regiuni> getRegiuni() {
        return regiuni;
    }

    public List<Localitati> getLocalitati() {
        return localitati;
    }
}
