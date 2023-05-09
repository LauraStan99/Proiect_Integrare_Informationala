package com.example.mongodatasource.controllers;

import com.example.mongodatasource.models.MedicalCost;
import com.example.mongodatasource.repositories.IMedicalCostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mongo/medical-cost")
public class MedicalCostEntityController {
    @Autowired
    private IMedicalCostRepository repository;

    @GetMapping("/{regionName}")
    public ResponseEntity<List<MedicalCost>> getMedicalCost(@PathVariable String regionName)
    {
        List<MedicalCost> medicalCosts = repository.findItemByRegion(regionName);
        return new ResponseEntity<>(medicalCosts, HttpStatus.OK);
    }
}
