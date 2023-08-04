package com.Persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.Persistence.entity.Empleados;




@Repository
public interface EmpleadosRepository extends JpaRepository<Empleados, Integer>{
//Es el DAO, hace las consultas	
	

}
