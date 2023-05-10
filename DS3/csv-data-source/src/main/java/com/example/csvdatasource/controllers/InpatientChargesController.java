package com.example.csvdatasource.controllers;

import com.example.csvdatasource.models.InpatientCharges;
import com.example.csvdatasource.models.InpatientChargesList;
import com.example.csvdatasource.services.InpatientChargesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/csv/inpatientCharges")
public class InpatientChargesController {
    @GetMapping()
    public ResponseEntity<List<InpatientCharges>> getHospitalAddress()
    {
        List<InpatientCharges> inpatientCgargesList = InpatientChargesService.getInpatientChargesList();
        return new ResponseEntity<>(inpatientCgargesList, HttpStatus.OK);
    }

    @GetMapping("{providerId}")
    public ResponseEntity<InpatientCharges> getHospitalAddress(@PathVariable String providerId)
    {
        InpatientCharges inpatientCgarges = InpatientChargesService.getInpatientCharges(providerId);
        return new ResponseEntity<>(inpatientCgarges, HttpStatus.OK);
    }

    @GetMapping("/getList")
    public ResponseEntity<InpatientChargesList> getInpatientChargesList()
    {
        List<InpatientCharges> tmpInpatientCgargesList = InpatientChargesService.getInpatientChargesList();
        InpatientChargesList inpatientChargesList = new InpatientChargesList(tmpInpatientCgargesList);
        return new ResponseEntity<>(inpatientChargesList, HttpStatus.OK);
    }
}
