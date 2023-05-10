package com.example.integration.models;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class InpatientChargesView {
    private Integer providerId;
    private String providerName;
    private String providerCity;
    private String providerState;
    private Integer providerZipCode;
    private String providerRegion;
    private Double totalPayments;

    public InpatientChargesView() {
    }

    public InpatientChargesView(Integer providerId, String providerName, String providerCity, String providerState, Integer providerZipCode, String providerRegion, Double totalPayments) {
        this.providerId = providerId;
        this.providerName = providerName;
        this.providerCity = providerCity;
        this.providerState = providerState;
        this.providerZipCode = providerZipCode;
        this.providerRegion = providerRegion;
        this.totalPayments = totalPayments;
    }

    public Integer getProviderId() {
        return providerId;
    }

    public void setProviderId(Integer providerId) {
        this.providerId = providerId;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderCity() {
        return providerCity;
    }

    public void setProviderCity(String providerCity) {
        this.providerCity = providerCity;
    }

    public String getProviderState() {
        return providerState;
    }

    public void setProviderState(String providerState) {
        this.providerState = providerState;
    }

    public Integer getProviderZipCode() {
        return providerZipCode;
    }

    public void setProviderZipCode(Integer providerZipCode) {
        this.providerZipCode = providerZipCode;
    }

    public String getProviderRegion() {
        return providerRegion;
    }

    public void setProviderRegion(String providerRegion) {
        this.providerRegion = providerRegion;
    }

    public Double getTotalPayments() {
        return totalPayments;
    }

    public void setTotalPayments(Double totalPayments) {
        this.totalPayments = totalPayments;
    }
}
