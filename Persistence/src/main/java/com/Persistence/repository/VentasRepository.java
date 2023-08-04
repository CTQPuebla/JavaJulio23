package com.Persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Persistence.entity.Ventas;



@Repository
public interface VentasRepository extends JpaRepository<Ventas, Integer>{
//Es el DAO, hace las consultas	
	

}