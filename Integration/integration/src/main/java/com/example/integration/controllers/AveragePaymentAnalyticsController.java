package com.example.integration.controllers;

import com.example.integration.models.AveragePaymentsAnalyticsView;
import com.example.integration.models.PaymentsByRatingIntegrationView;
import com.example.integration.services.AveragePaymentsService;
import com.example.integration.services.PaymentsByRatingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/analytics")
public class AveragePaymentAnalyticsController {
    @GetMapping()
    public ResponseEntity<List<AveragePaymentsAnalyticsView>> getAnalytics()
    {
        List<AveragePaymentsAnalyticsView> averageList = AveragePaymentsService.getAnalyticsView();

        return new ResponseEntity<>(averageList, HttpStatus.OK);
    }
}
