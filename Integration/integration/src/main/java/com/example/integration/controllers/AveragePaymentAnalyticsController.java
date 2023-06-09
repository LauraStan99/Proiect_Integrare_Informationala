package com.example.integration.controllers;

import com.example.integration.analyticsmodels.AveragePaymentsAnalyticsView;
import com.example.integration.services.AveragePaymentsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/analytics")
@CrossOrigin(origins = "http://localhost:4200")
public class AveragePaymentAnalyticsController {
    @GetMapping()
    public ResponseEntity<List<AveragePaymentsAnalyticsView>> getAnalytics()
    {
        List<AveragePaymentsAnalyticsView> averageList = AveragePaymentsService.getAnalyticsView();

        return new ResponseEntity<>(averageList, HttpStatus.OK);
    }
}
