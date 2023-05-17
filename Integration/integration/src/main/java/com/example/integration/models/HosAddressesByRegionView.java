package com.example.integration.models;

public class HosAddressesByRegionView {
    private String hospitalRegion;
    private Integer numberOfHospitals;

    public HosAddressesByRegionView() {
    }

    public HosAddressesByRegionView(String hospitalRegion, Integer numberOfHospitals) {
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
