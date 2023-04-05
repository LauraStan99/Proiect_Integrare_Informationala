package com.iis_proiect.repositories;

import com.iis_proiect.models.MedicalCost;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMedicalCostRepository extends MongoRepository<MedicalCost, String> {

    @Query("{region: '?0'}")
    List<MedicalCost> findItemByRegion(String regionName);
}
