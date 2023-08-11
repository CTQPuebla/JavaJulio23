package com.msproductos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msproductos.entity.Departamentos;
@Repository
public interface DepartamentosRepository extends JpaRepository<Departamentos, Integer>{

}
