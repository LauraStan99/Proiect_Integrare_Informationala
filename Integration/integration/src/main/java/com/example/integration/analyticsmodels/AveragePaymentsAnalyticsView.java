package com.example.integration.analyticsmodels;

public class AveragePaymentsAnalyticsView {
    // field: from PaymentsByRatingIntegration
    private String hospitalOverallRating;
    // computed field : from PaymentsByRatingIntegration
    private Double averageTotalPayments;

    public AveragePaymentsAnalyticsView() {
    }

    public AveragePaymentsAnalyticsView(String hospitalOverallRating, Double averageTotalPayments) {
        this.hospitalOverallRating = hospitalOverallRating;
        this.averageTotalPayments = averageTotalPayments;
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
