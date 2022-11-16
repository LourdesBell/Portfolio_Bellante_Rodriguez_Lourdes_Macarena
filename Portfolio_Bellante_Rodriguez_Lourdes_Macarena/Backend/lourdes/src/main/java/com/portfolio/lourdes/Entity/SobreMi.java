package com.portfolio.lourdes.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SobreMi{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreSobreMi;
    private String descripcionSobreMi;
    
    //Constructores

    public SobreMi() {
    }

    public SobreMi(String nombreSobreMi, String descripcionSobreMi) {
        this.nombreSobreMi= nombreSobreMi;
        this.descripcionSobreMi= descripcionSobreMi;
    }
    
    //Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreSobreMi() {
        return nombreSobreMi;
    }

    public void setNombreSobreMi(String nombreSobreMi) {
        this.nombreSobreMi= nombreSobreMi;
    }

    public String getdescripcionSobreMi() {
        return descripcionSobreMi;
    }

    public void setDescripcionSobreMi(String descripcionSobreMi) {
        this.descripcionSobreMi= descripcionSobreMi;
    }
    
}
