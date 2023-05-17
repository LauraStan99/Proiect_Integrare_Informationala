package com.example.integration.services;

import com.example.integration.analyticsmodels.NoHospitalsByRegionAnalyticsView;
import com.example.integration.models.HosAddressesByRegionView;
import com.example.integration.models.MedicalCostView;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

public class AddressesByRegionService {
    private static final String addressesByRegionURL = "http://localhost:8090/oracle/hospitalAddresses/region";
    public static List<NoHospitalsByRegionAnalyticsView> getMedicalCosts()
    {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<NoHospitalsByRegionAnalyticsView[]> responseEntity = restTemplate.exchange(addressesByRegionURL, HttpMethod.GET, null, NoHospitalsByRegionAnalyticsView[].class);

        return Arrays.stream(responseEntity.getBody()).toList();
    }
}
