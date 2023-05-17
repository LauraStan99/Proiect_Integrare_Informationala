package com.example.integration.integrmodels;

public class PaymentsByRatingIntegrationView {
    // from Oracle
    private String hospitalName;
    private String hospitalOverallRating;
    // from CSV
    private Double averageTotalPayments;

    public PaymentsByRatingIntegrationView() {
    }

    public PaymentsByRatingIntegrationView(String hospitalName, String hospitalOverallRating, Double averageTotalPayments) {
        this.hospitalName = hospitalName;
        this.hospitalOverallRating = hospitalOverallRating;
        this.averageTotalPayments = averageTotalPayments;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalOverallRating() {
        return hospitalOverallRating;
    }

    public void setHospitalOverallRating(String hospitalOverallRating) {
        this.hospitalOverallRating = hospitalOverallRating;
    }

    public Double getAverageTotalPayments() {
        return averageTotalPayments;
    }

    public void setAverageTotalPayments(Double averageTotalPayments) {
        this.averageTotalPayments = averageTotalPayments;
    }
}
