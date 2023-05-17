package com.example.integration.controllers;

import com.example.integration.integrmodels.PaymentsByRatingIntegrationView;
import com.example.integration.services.PaymentsByRatingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/integration")
public class PaymentsByRatingIntegrationController {
    @GetMapping()
    public ResponseEntity<List<PaymentsByRatingIntegrationView>> getIntegration()
    {
        List<PaymentsByRatingIntegrationView> paymentsByRatingIntegrationViews = PaymentsByRatingService.getPaymentsByRating();

        return new ResponseEntity<>(paymentsByRatingIntegrationViews, HttpStatus.OK);
    }

    @GetMapping("/test")
    public ResponseEntity<String> getTest()
    {
        return new ResponseEntity<>("Just For Test", HttpStatus.OK);
    }
}
