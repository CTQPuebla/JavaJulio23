package com.Persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.Persistence.entity.DetVenta;

@Repository
public interface DetVentaRepository extends JpaRepository<DetVenta, Integer>{

}
