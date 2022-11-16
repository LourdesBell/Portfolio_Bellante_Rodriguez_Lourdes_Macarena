package com.portfolio.lourdes.Dto;
import javax.validation.constraints.NotBlank;

public class dtoSobreMi{
    @NotBlank
    private String nombreSobreMi;
    @NotBlank
    private String descripcionSobreMi;
    
    //Constructores

    public dtoSobreMi() {
    }

    public dtoSobreMi(String nombreSobreMi, String descripcionSobreMi) {
        this.nombreSobreMi= nombreSobreMi;
        this.descripcionSobreMi= descripcionSobreMi;
    }
    //Getters & Setters

    public String getNombreSobreMi() {
        return nombreSobreMi;
    }

    public void setNombreSobreMi(String nombreSobreMi) {
        this.nombreSobreMi= nombreSobreMi;
    }

    public String getDescripcionSobreMi() {
        return descripcionSobreMi;
    }

    public void setDescripcionSobreMi(String descripcionSobreMi) {
        this.descripcionSobreMi= descripcionSobreMi;
    }
    
}
