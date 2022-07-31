package com.portfolio.lourdes.Dto;

import javax.validation.constraints.NotBlank;

public class dtoHabilidades {
    @NotBlank
    private String nombreHabilidades;
    @NotBlank
    private Number descripcionHabilidades;
    
    //Constructores

    public dtoHabilidades() {
    }

    public dtoHabilidades(String nombreHabilidades, Number descripcionHabilidades) {
        this.nombreHabilidades = nombreHabilidades;
        this.descripcionHabilidades = descripcionHabilidades;
    }
    //Getters & Setters

    public String getnombreHabilidades() {
        return nombreHabilidades;
    }

    public void setnombreHabilidades(String nombreHabilidades) {
        this.nombreHabilidades = nombreHabilidades;
    }

    public Number getDescripcionHabilidades() {
        return descripcionHabilidades;
    }

    public void setDescripcionHabilidades(Number descripcionHabilidades) {
        this.descripcionHabilidades = descripcionHabilidades;
    }
    
}
