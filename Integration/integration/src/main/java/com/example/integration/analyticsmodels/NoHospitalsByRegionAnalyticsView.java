package com.example.integration.analyticsmodels;

public class NoHospitalsByRegionAnalyticsView {
    private String hospitalRegion;
    private Integer numberOfHospitals;

    public NoHospitalsByRegionAnalyticsView() {
    }

    public NoHospitalsByRegionAnalyticsView(String hospitalRegion, Integer numberOfHospitals) {
        this.hospitalRegion = hospitalRegion;
        this.numberOfHospitals = numberOfHospitals;
    }

    public String getHospitalRegion() {
        return hospitalRegion;
    }

    public void setHospitalRegion(String hospitalRegion) {
        this.hospitalRegion = hospitalRegion;
    }

    public Integer getNumberOfHospitals() {
        return numberOfHospitals;
    }

    public void setNumberOfHospitals(Integer numberOfHospitals) {
        this.numberOfHospitals = numberOfHospitals;
    }
}
