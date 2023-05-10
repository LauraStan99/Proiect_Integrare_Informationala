package com.example.integration.services;

import com.example.integration.models.InpatientChargesView;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class InpatientChargesService {
    private static final String inpatientChargesURL = "http://localhost:8092/csv/inpatientCharges";
    public static InpatientChargesView[] getInpatientCharges()
    {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<InpatientChargesView[]> responseEntity = restTemplate.exchange(inpatientChargesURL, HttpMethod.GET, null, InpatientChargesView[].class);

        return responseEntity.getBody();
    }
}
