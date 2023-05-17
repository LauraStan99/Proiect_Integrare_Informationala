package com.example.oracledatasource.controllers;

import com.example.oracledatasource.models.HospitalDetailsByRegion;
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

import java.util.*;

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

    @GetMapping("/region")
    public ResponseEntity<List<HospitalDetailsByRegion>> getHospitalAddressesByRegion()
    {
        List<String> southWest = Arrays.asList("AZ", "NM", "TX", "OK");
        List<String> southEast = Arrays.asList("AR", "LA", "MS", "AL", "GA", "TN", "KY", "NC", "FL");
        List<String> northEast = Arrays.asList("PA", "MD", "NY", "ME");
        List<Hospitaladdresses> hospitalAddresses = repository.findAll();
        Map<String, Integer> regionNoHospitals = new HashMap<>();
        regionNoHospitals.put("southwest", 0);
        regionNoHospitals.put("southeast", 0);
        regionNoHospitals.put("northeast", 0);

        for (Hospitaladdresses hospitalAdress: hospitalAddresses) {
            if(southWest.contains(hospitalAdress.getState())){
                regionNoHospitals.put("southwest", regionNoHospitals.get("southwest") + 1);
            }
            if(southEast.contains(hospitalAdress.getState())){
                regionNoHospitals.put("southeast", regionNoHospitals.get("southeast") + 1);
            }
            if(northEast.contains(hospitalAdress.getState())){
                regionNoHospitals.put("northeast", regionNoHospitals.get("northeast") + 1);
            }

        }
        List<HospitalDetailsByRegion> result = regionNoHospitals.entrySet()
                .stream()
                .map(e -> new HospitalDetailsByRegion(e.getKey(), e.getValue()))
                .toList();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
