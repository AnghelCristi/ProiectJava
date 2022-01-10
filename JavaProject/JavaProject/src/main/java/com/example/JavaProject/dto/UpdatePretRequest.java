package com.example.JavaProject.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class UpdatePretRequest {

    @NotNull
    @Min(0)
    private Long idAnunt;

    @NotNull
    private Double pretAnunt;

    public UpdatePretRequest() {
    }

    public UpdatePretRequest(Long idAnunt, Double pretAnunt) {
        this.idAnunt = idAnunt;
        this.pretAnunt = pretAnunt;
    }

    public Long getIdAnunt() {
        return idAnunt;
    }

    public void setIdAnunt(Long idAnunt) {
        this.idAnunt = idAnunt;
    }

    public Double getPretAnunt() {
        return pretAnunt;
    }

    public void setPretAnunt(Double pretAnunt) {
        this.pretAnunt = pretAnunt;
    }
}
