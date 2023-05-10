package com.example.oracledatasource.controllers;

import com.example.oracledatasource.models.Hospitaldetails;
import com.example.oracledatasource.repositories.IHospitalDetailRepository;
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
