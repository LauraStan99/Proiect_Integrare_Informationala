package com.example.oracledatasource.repositories;

import com.example.oracledatasource.models.Hospitaldetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHospitalDetailRepository extends JpaRepository<Hospitaldetails, Integer> {
}
