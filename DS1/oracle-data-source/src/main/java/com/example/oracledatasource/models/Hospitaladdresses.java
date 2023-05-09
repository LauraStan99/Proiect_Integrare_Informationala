package com.example.oracledatasource.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Hospitaladdresses implements Comparable<Hospitaladdresses>, Serializable {
    @Id
    private Integer hospitaladdressid;
    private Integer providerId;
    private String address;
    private String city;
    private String state;
    private Integer zipCode;
    private String countyName;

    public Hospitaladdresses() {
        super();
    }

    public Integer getHospitaladdressid() {
        return hospitaladdressid;
    }

    public void setHospitaladdressid(Integer hospitaladdressid) {
        this.hospitaladdressid = hospitaladdressid;
    }

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    @Override
    public int compareTo(Hospitaladdresses o) {
        return 0;
    }
}
