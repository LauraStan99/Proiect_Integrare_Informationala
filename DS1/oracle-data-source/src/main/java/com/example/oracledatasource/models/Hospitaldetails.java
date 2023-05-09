package com.example.oracledatasource.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Hospitaldetails implements Comparable<Hospitaldetails>, Serializable {
    @Id
    private Integer providerId;
    private String hospitalName;
    private String emergencyServices;
    private String hospitalOverallRating;
    private Integer hospitalType;

    public Hospitaldetails() {
        super();
        this.hospitalName = "";
        this.emergencyServices = "";
        this.hospitalOverallRating = "";
        this.hospitalType = 0;
    }

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getEmergencyServices() {
        return emergencyServices;
    }

    public void setEmergencyServices(String emergencyServices) {
        this.emergencyServices = emergencyServices;
    }

    public String getHospitalOverallRating() {
        return hospitalOverallRating;
    }

    public void setHospitalOverallRating(String hospitalOverallRating) {
        this.hospitalOverallRating = hospitalOverallRating;
    }

    public Integer getHospitalType() {
        return hospitalType;
    }

    public void setHospitalType(Integer hospitalType) {
        this.hospitalType = hospitalType;
    }

    @Override
    public int compareTo(Hospitaldetails o) {
        return 0;
    }
}
