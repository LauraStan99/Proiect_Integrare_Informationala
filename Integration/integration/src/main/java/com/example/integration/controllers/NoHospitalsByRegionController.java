package com.example.integration.controllers;

import com.example.integration.analyticsmodels.AveragePaymentsAnalyticsView;
import com.example.integration.analyticsmodels.NoHospitalsByRegionAnalyticsView;
import com.example.integration.services.AddressesByRegionService;
import com.example.integration.services.AveragePaymentsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/analytics/region")
@CrossOrigin(origins = "http://localhost:4200")
public class NoHospitalsByRegionController {
    @GetMapping()
    public ResponseEntity<List<NoHospitalsByRegionAnalyticsView>> getAnalytics()
    {
        List<NoHospitalsByRegionAnalyticsView> hospitalsByRegionList = AddressesByRegionService.getMedicalCosts();

        return new ResponseEntity<>(hospitalsByRegionList, HttpStatus.OK);
    }
}
