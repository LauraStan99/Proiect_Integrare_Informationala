package com.iis_proiect.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Hospitaltypes implements Comparable<Hospitaltypes>, Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Hospitaltypeid;

    private String Hospitaltype;

    public Integer getHospitaltypeid() {
        return Hospitaltypeid;
    }

    public void setHospitaltypeid(Integer hospitaltypeid) {
        Hospitaltypeid = hospitaltypeid;
    }

    public String getHospitaltype() {
        return Hospitaltype;
    }

    public void setHospitaltype(String hospitaltype) {
        Hospitaltype = hospitaltype;
    }

    public Hospitaltypes(){
        super();
        this.Hospitaltype = "";
    }

    public Hospitaltypes(String hospytalType){
        super();
        this.Hospitaltype = hospytalType;
    }

    @Override
    public int compareTo(Hospitaltypes o) {
        return 0;
    }
}
