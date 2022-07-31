package com.portfolio.lourdes.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Habilidades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreHabilidades;
    private Number descripcionHabilidades;
    
    //Constructores

    public Habilidades() {
    }

    public Habilidades(String nombreHabilidades, Number descripcionHabilidades) {
        this.nombreHabilidades = nombreHabilidades;
        this.descripcionHabilidades = descripcionHabilidades;
    }
    
    //Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
