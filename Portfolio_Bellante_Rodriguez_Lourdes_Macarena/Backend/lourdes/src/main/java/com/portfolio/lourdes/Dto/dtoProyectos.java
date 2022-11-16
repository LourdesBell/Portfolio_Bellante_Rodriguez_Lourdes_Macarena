package com.portfolio.lourdes.Dto;
import javax.validation.constraints.NotBlank;

public class dtoProyectos {
    @NotBlank
    private String nombreProyectos;
    @NotBlank
    private String urlProyectos;
    
    //Constructores

    public dtoProyectos() {
    }

    public dtoProyectos(String nombreProyectos, String urlProyectos) {
        this.nombreProyectos = nombreProyectos;
        this.urlProyectos = urlProyectos;
    }
    //Getters & Setters

    public String getNombreProyectos() {
        return nombreProyectos;
    }

    public void setNombreProyectos(String nombreProyectos) {
        this.nombreProyectos= nombreProyectos;
    }

    public String getUrlProyectos() {
        return urlProyectos;
    }

    public void setUrlProyectos(String urlProyectos) {
        this.urlProyectos = urlProyectos;
    }
    
}
