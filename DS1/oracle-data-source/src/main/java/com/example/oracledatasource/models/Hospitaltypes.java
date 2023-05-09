package com.example.oracledatasource.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Hospitaltypes implements Comparable<Hospitaltypes>, Serializable {
    @Id
    private Integer hospitaltypeid;
    private String hospitaltype;

    public Hospitaltypes(){
        super();
        this.hospitaltype = "";
    }

    public Hospitaltypes(String hospitalTypes){
        super();
        this.hospitaltype = hospitalTypes;
    }

    public Integer getHospitaltypeid() {
        return hospitaltypeid;
    }

    public void setHospitaltypeid(Integer hospitaltypeid) {
        this.hospitaltypeid = hospitaltypeid;
    }

    public String getHospitaltype() {
        return hospitaltype;
    }

    public void setHospitaltype(String hospitaltype) {
        this.hospitaltype = hospitaltype;
    }

    @Override
    public int compareTo(Hospitaltypes o) {
        return 0;
    }
}
