package com.example.oracledatasource.controllers;

import com.example.oracledatasource.models.Hospitaladdresses;
import com.example.oracledatasource.models.Hospitaldetails;
import com.example.oracledatasource.repositories.IHospitalAddressesRepository;
import com.example.oracledatasource.repositories.IHospitalDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/oracle/hospitalAddresses")
public class HospitalAddressesEntityController {
    @Autowired
    private IHospitalAddressesRepository repository;

    @GetMapping("/{hospitalAddressId}")
    public ResponseEntity<Optional<Hospitaladdresses>> getHospitalAddress(@PathVariable Integer hospitalAddressId)
    {
        Optional<Hospitaladdresses> hospitalAddress = repository.findById(hospitalAddressId);
        return new ResponseEntity<>(hospitalAddress, HttpStatus.OK);
    }
}
