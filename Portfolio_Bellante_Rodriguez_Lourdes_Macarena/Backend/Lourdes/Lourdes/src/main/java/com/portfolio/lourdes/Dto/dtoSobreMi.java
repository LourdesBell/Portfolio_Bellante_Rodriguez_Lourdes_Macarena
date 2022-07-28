
package com.portfolio.lourdes.Dto;

import javax.validation.constraints.NotBlank;

public class dtoSobreMi {
    @NotBlank
    private String tituloSobreMi;
    @NotBlank
    private String descripcionSobreMi;
    
    //Constructores

    public dtoSobreMi() {
    }

    public dtoSobreMi(String tituloSobreMi, String descripcionSobreMi) {
        this.tituloSobreMi = tituloSobreMi;
        this.descripcionSobreMi = descripcionSobreMi;
    }
    //Getters & Setters

    public String getTituloSobreMi() {
        return tituloSobreMi;
    }

    public void setTituloSobreMi(String tituloSobreMi) {
        this.tituloSobreMi = tituloSobreMi;
    }

    public String getDescripcionSobreMi() {
        return descripcionSobreMi;
    }

    public void setDescripcionSobreMi(String descripcionSobreMi) {
        this.descripcionSobreMi = descripcionSobreMi;
    }
    
}
