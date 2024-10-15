package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Offre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long code;
    private String intitulé;
    private String specialité;
    private String société;
    private int nbpostes;
    private String pays;

    public Offre( String intitulé ,  String specialité ,  String société , int nbpostes ,  String pays)
    {

        this.specialité = specialité;
        this.société = société ;
        this.intitulé = intitulé ;
        this.nbpostes = nbpostes;
        this.pays = pays;
    }
    public Offre()
    {
        super();
    }
    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getIntitulé() {
        return intitulé;
    }

    public void setIntitulé(String intitulé) {
        this.intitulé = intitulé;
    }

    public String getSpecialité() {
        return specialité;
    }

    public void setSpecialité(String specialité) {
        this.specialité = specialité;
    }

    public String getSociété() {
        return société;
    }

    public void setSociété(String société) {
        this.société = société;
    }

    public int getNbpostes() {
        return nbpostes;
    }

    public void setNbpostes(int nbpostes) {
        this.nbpostes = nbpostes;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

}

