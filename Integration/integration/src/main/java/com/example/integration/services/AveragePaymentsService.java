package com.example.integration.services;

import com.example.integration.models.AveragePaymentsAnalyticsView;
import com.example.integration.models.PaymentsByRatingIntegrationView;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AveragePaymentsService {

    private static final String integrationURL = "http://localhost:8093/integration";
    public static List<AveragePaymentsAnalyticsView> getAnalyticsView()
    {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<PaymentsByRatingIntegrationView[]> responseEntity = restTemplate.exchange(integrationURL, HttpMethod.GET, null, PaymentsByRatingIntegrationView[].class);

        PaymentsByRatingIntegrationView[] integrationArray = responseEntity.getBody();

        Map<String, Double> averages = Arrays.stream(integrationArray).collect(
                Collectors.groupingBy(PaymentsByRatingIntegrationView::getHospitalOverallRating, Collectors.averagingDouble(PaymentsByRatingIntegrationView::getAverageTotalPayments)));

        return averages.entrySet().stream().map(v -> new AveragePaymentsAnalyticsView(v.getKey(), v.getValue())).toList();
    }
}
