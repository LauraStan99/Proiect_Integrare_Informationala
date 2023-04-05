package com.iis_proiect.controllers;

import com.iis_proiect.models.Hospitaltypes;
import com.iis_proiect.models.MedicalCost;
import com.iis_proiect.repositories.IMedicalCostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/NOSQL/medical-cost")
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
