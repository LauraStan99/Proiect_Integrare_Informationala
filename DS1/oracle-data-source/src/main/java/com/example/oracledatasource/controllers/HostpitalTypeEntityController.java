package com.example.oracledatasource.controllers;

import com.example.oracledatasource.models.Hospitaltypes;
import com.example.oracledatasource.repositories.IHospitalTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/oracle/hospitaltype")
public class HostpitalTypeEntityController {
    @Autowired
    private IHospitalTypeRepository repository;

    @GetMapping("/{hospitalId}")
    public ResponseEntity<Optional<Hospitaltypes>> getHospitalType(@PathVariable Integer hospitalId)
    {
        Optional<Hospitaltypes> hospitalType = repository.findById(hospitalId);
        return new ResponseEntity<>(hospitalType, HttpStatus.OK);
    }
}
