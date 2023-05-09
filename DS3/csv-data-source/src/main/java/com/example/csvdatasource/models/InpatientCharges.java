package com.example.csvdatasource.models;

import java.io.Serializable;

public class InpatientCharges implements Comparable<InpatientCharges>, Serializable {
    private Integer providerId;
    private String providerName;
    private String providerCity;
    private String providerState;
    private Integer providerZipCode;
    private String providerRegion;
    private Double totalPayments;

    public InpatientCharges() {
    }

    public InpatientCharges(String[] attributes){
        this.providerId = Integer.getInteger(attributes[0]);
        this.providerName = attributes[1];
        this.providerCity = attributes[2];
        this.providerState = attributes[3];
        this.providerZipCode = Integer.getInteger(attributes[4]);
        this.providerRegion = attributes[5];
        this.totalPayments = Double.parseDouble(attributes[6].substring(1));
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

    @Override
    public String toString() {
        return "ImpatientCharges{" +
                "providerId=" + providerId +
                ", providerName='" + providerName + '\'' +
                ", providerCity='" + providerCity + '\'' +
                ", providerState='" + providerState + '\'' +
                ", providerZipCode=" + providerZipCode +
                ", providerRegion='" + providerRegion + '\'' +
                ", totalPayments=" + totalPayments +
                '}';
    }

    @Override
    public int compareTo(InpatientCharges o) {
        return this.providerZipCode.compareTo(o.providerZipCode);
    }
}
