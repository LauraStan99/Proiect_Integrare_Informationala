package com.example.integration.models;

import java.io.Serializable;

public class HospitalDetailsView implements Serializable {
    private Integer providerId;
    private String hospitalName;
    private String emergencyServices;
    private String hospitalOverallRating;
    private Integer hospitalType;

    public HospitalDetailsView() {
    }

    public HospitalDetailsView(Integer providerId, String hospitalName, String emergencyServices, String hospitalOverallRating, Integer hospitalType) {
        super();
        this.providerId = providerId;
        this.hospitalName = hospitalName;
        this.emergencyServices = emergencyServices;
        this.hospitalOverallRating = hospitalOverallRating;
        this.hospitalType = hospitalType;
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
}
