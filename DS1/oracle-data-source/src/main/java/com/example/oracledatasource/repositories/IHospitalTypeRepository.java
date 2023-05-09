package com.example.oracledatasource.repositories;

import com.example.oracledatasource.models.Hospitaltypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHospitalTypeRepository extends JpaRepository<Hospitaltypes, Integer> {
}
