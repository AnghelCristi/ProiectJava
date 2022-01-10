package com.example.JavaProject.model;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "anunturi")
public class Anunturi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAnunt")
    private long idAnunt;

    @Column(name = "monthIn", nullable = false)
    private long monthIn;

    @Column(name = "monthOut", nullable = false)
    private long monthOut;

    @Column(name = "pret", nullable = false)
    private Double pret;

    @Column(name = "sport", nullable = false)
    private String sport;

    @ManyToOne
    @JoinColumn(name = "idTara")
    private Tari tari;

    @ManyToOne
    @JoinColumn(name = "idRegiune")
    private Regiuni regiuni;

    @ManyToOne
    @JoinColumn(name = "idLocalitate")
    private Localitati localitati;

    public Anunturi() {
    }

    public Anunturi(long monthIn, long monthOut, Double pret, String sport, Tari tari, Regiuni regiuni, Localitati localitati) {
        this.monthIn = monthIn;
        this.monthOut = monthOut;
        this.pret = pret;
        this.sport = sport;
        this.tari = tari;
        this.regiuni = regiuni;
        this.localitati = localitati;
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

    public Long getLocalitate(){
        return localitati.getIdLocalitate();
    }

    public String getNumeLocalitate(){
        return localitati.getNumeLocalitate();
    }


    public long getmonthIn() {
        return monthIn;
    }

    public long getMonthOut() {
        return monthOut;
    }

    public Double getPret() {
        return pret;
    }

    public String getSport() {
        return sport;
    }

    public void setMonthIn(long monthIn) {
        this.monthIn = monthIn;
    }

    public void setMonthOut(long monthOut) {
        this.monthOut = monthOut;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public long getIdAnunt() {
        return idAnunt;
    }


}
