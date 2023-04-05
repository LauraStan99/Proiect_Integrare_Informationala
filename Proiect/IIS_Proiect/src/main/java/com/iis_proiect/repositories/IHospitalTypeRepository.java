package com.iis_proiect.repositories;

import com.iis_proiect.models.Hospitaltypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHospitalTypeRepository extends JpaRepository<Hospitaltypes, Integer> {
}
