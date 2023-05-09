package com.example.oracledatasource.repositories;

import com.example.oracledatasource.models.Hospitaladdresses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHospitalAddressesRepository extends JpaRepository<Hospitaladdresses, Integer> {
}
