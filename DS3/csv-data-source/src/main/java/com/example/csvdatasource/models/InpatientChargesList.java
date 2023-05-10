package com.example.csvdatasource.models;

import java.util.List;

public class InpatientChargesList {
    private List<InpatientCharges> inpatientChargesList;

    public InpatientChargesList(List<InpatientCharges> inpatientChargesList) {
        this.inpatientChargesList = inpatientChargesList;
    }

    public List<InpatientCharges> getInpatientChargesList() {
        return inpatientChargesList;
    }

    public void setInpatientChargesList(List<InpatientCharges> inpatientChargesList) {
        this.inpatientChargesList = inpatientChargesList;
    }
}
