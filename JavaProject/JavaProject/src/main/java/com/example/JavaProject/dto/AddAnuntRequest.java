package com.example.JavaProject.dto;

import com.example.JavaProject.model.Localitati;
import com.example.JavaProject.model.Regiuni;
import com.example.JavaProject.model.Tari;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class AddAnuntRequest {

    @NotNull
    private Long monthInAnunt;

    @NotNull
    private Long monthOutAnunt;

    @NotNull
    private Double pretAnunt;

    @NotBlank
    private String sportAnunt;

    private Localitati LocalitateAnunt;

    private Regiuni RegiuneAnunt;

    private Tari TaraAnunt;

    public AddAnuntRequest() {
    }

    public AddAnuntRequest(Long monthInAnunt, Long monthOutAnunt, Double pretAnunt, String sportAnunt, Localitati localitateAnunt, Regiuni regiuneAnunt, Tari taraAnunt) {
        this.monthInAnunt = monthInAnunt;
        this.monthOutAnunt = monthOutAnunt;
        this.pretAnunt = pretAnunt;
        this.sportAnunt = sportAnunt;
        LocalitateAnunt = localitateAnunt;
        RegiuneAnunt = regiuneAnunt;
        TaraAnunt = taraAnunt;
    }

    public Long getMonthInAnunt() {
        return monthInAnunt;
    }

    public void setMonthInAnunt(Long monthInAnunt) {
        this.monthInAnunt = monthInAnunt;
    }

    public Long getMonthOutAnunt() {
        return monthOutAnunt;
    }

    public void setMonthOutAnunt(Long monthOutAnunt) {
        this.monthOutAnunt = monthOutAnunt;
    }

    public Double getPretAnunt() {
        return pretAnunt;
    }

    public void setPretAnunt(Double pretAnunt) {
        this.pretAnunt = pretAnunt;
    }

    public String getSportAnunt() {
        return sportAnunt;
    }

    public void setSportAnunt(String sportAnunt) {
        this.sportAnunt = sportAnunt;
    }

    public Localitati getLocalitateAnunt() {
        return LocalitateAnunt;
    }

    public void setLocalitateAnunt(Localitati localitateAnunt) {
        LocalitateAnunt = localitateAnunt;
    }

    public Regiuni getRegiuneAnunt() {
        return RegiuneAnunt;
    }

    public void setRegiuneAnunt(Regiuni regiuneAnunt) {
        RegiuneAnunt = regiuneAnunt;
    }

    public Tari getTaraAnunt() {
        return TaraAnunt;
    }

    public void setTaraAnunt(Tari taraAnunt) {
        TaraAnunt = taraAnunt;
    }
}
