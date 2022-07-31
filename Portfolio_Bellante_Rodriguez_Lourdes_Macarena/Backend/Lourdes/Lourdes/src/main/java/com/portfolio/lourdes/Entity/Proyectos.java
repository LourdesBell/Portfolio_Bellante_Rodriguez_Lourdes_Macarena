package com.portfolio.lourdes.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreProyectos;
    private String urlProyectos;
    
    //Constructores

    public Proyectos() {
    }

    public Proyectos(String nombreProyectos, String urlProyectos) {
        this.nombreProyectos = nombreProyectos;
        this.urlProyectos = urlProyectos;
    }
    
    //Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreProyectos() {
        return nombreProyectos;
    }

    public void setNombreProyectos(String nombreProyectos) {
        this.nombreProyectos = nombreProyectos;
    }

    public String geturlProyectos() {
        return urlProyectos;
    }

    public void setUrlProyectos(String urlProyectos) {
        this.urlProyectos = urlProyectos;
    }
    
}
