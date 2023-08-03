package com.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.persistence.entity.Det_Venta;

@Repository
public interface Det_VentaRepository extends JpaRepository<Det_Venta, Integer> {

}
