package com.example.integration.services;

import com.example.integration.models.HospitalDetailsView;
import com.example.integration.models.InpatientChargesView;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class HospitalDetailsService {
    private static final String hospitalDetailsURL = "http://localhost:8090/oracle/hospitaldetail";
    public static HospitalDetailsView[] getHospitalDetails()
    {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<HospitalDetailsView[]> responseEntity = restTemplate.exchange(hospitalDetailsURL, HttpMethod.GET, null, HospitalDetailsView[].class);

        return responseEntity.getBody();
    }
}
