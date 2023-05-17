package com.example.oracledatasource.controllers;

import com.example.oracledatasource.models.HospitalDetailsByRegion;
import com.example.oracledatasource.models.Hospitaladdresses;
import com.example.oracledatasource.models.Hospitaldetails;
import com.example.oracledatasource.repositories.IHospitalAddressesRepository;
import com.example.oracledatasource.repositories.IHospitalDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/oracle/hospitaldetail")
public class HospitalDetailEntityController {

    @Autowired
    private IHospitalDetailRepository repository;

    @GetMapping("/{providerId}")
    public ResponseEntity<Optional<Hospitaldetails>> getHospitalDetail(@PathVariable Integer providerId)
    {
        Optional<Hospitaldetails> hospitalDetail = repository.findById(providerId);
        return new ResponseEntity<>(hospitalDetail, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<Hospitaldetails>> getHospitalsDetail()
    {
        List<Hospitaldetails> hospitalDetail = repository.findAll();
        return new ResponseEntity<>(hospitalDetail, HttpStatus.OK);
    }
}
