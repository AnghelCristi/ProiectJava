package com.example.JavaProject.dto;

import com.example.JavaProject.model.Localitati;
import com.example.JavaProject.model.Regiuni;
import com.example.JavaProject.model.Tari;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class AddAnuntRequestV1 {

    @NotNull
    private Long monthInAnunt;

    @NotNull
    private Long monthOutAnunt;

    @NotNull
    private Double pretAnunt;

    @NotBlank
    private String sportAnunt;

    @NotNull
    private Long idLocalitateAnunt;

    @NotNull
    private Long idRegiuneAnunt;

    @NotNull
    private Long idTaraAnunt;

    public AddAnuntRequestV1() {
    }

    public AddAnuntRequestV1(Long monthInAnunt, Long monthOutAnunt, Double pretAnunt, String sportAnunt, Long idLocalitateAnunt, Long idRegiuneAnunt, Long idTaraAnunt) {
        this.monthInAnunt = monthInAnunt;
        this.monthOutAnunt = monthOutAnunt;
        this.pretAnunt = pretAnunt;
        this.sportAnunt = sportAnunt;
        this.idLocalitateAnunt = idLocalitateAnunt;
        this.idRegiuneAnunt = idRegiuneAnunt;
        this.idTaraAnunt = idTaraAnunt;
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

    public Long getIdLocalitateAnunt() {
        return idLocalitateAnunt;
    }

    public void setIdLocalitateAnunt(Long idLocalitateAnunt) {
        this.idLocalitateAnunt = idLocalitateAnunt;
    }

    public Long getIdRegiuneAnunt() {
        return idRegiuneAnunt;
    }

    public void setIdRegiuneAnunt(Long idRegiuneAnunt) {
        this.idRegiuneAnunt = idRegiuneAnunt;
    }

    public Long getIdTaraAnunt() {
        return idTaraAnunt;
    }

    public void setIdTaraAnunt(Long idTaraAnunt) {
        this.idTaraAnunt = idTaraAnunt;
    }
}
