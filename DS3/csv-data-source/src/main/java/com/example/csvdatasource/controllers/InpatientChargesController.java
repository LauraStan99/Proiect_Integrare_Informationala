package com.example.csvdatasource.controllers;

import com.example.csvdatasource.models.InpatientCharges;
import com.example.csvdatasource.services.InpatientChargesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/csv/inpatientCharges")
public class InpatientChargesController {
    @GetMapping()
    public ResponseEntity<List<InpatientCharges>> getHospitalAddress()
    {
        List<InpatientCharges> hospitalAddress = InpatientChargesService.getImpatientChargesList();
        return new ResponseEntity<>(hospitalAddress, HttpStatus.OK);
    }
}
