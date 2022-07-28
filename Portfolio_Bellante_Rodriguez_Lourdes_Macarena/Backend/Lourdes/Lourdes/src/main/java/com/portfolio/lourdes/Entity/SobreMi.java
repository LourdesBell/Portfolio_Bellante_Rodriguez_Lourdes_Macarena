package com.portfolio.lourdes.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class SobreMi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String tituloSobreMi;
    private String descripcionSobreMi;
    
    //Constructores

    public SobreMi() {
    }

    public SobreMi(String tituloSobreMi, String descripcionSobreMi) {
        this.tituloSobreMi = tituloSobreMi;
        this.descripcionSobreMi = descripcionSobreMi;
    }
    
    //Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSobreMi() {
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
