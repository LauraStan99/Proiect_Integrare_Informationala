package com.example.integration.services;

import com.example.integration.models.HospitalDetailsView;
import com.example.integration.models.MedicalCostView;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class MedicalCostService {
    private static final String medicalCostURL = "http://localhost:8091/mongo/medical-cost";
    public static MedicalCostView[] getMedicalCosts()
    {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<MedicalCostView[]> responseEntity = restTemplate.exchange(medicalCostURL, HttpMethod.GET, null, MedicalCostView[].class);

        return responseEntity.getBody();
    }
}
