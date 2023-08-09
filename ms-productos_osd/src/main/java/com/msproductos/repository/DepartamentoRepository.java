package com.msproductos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.msproductos.entity.Departamentos;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamentos, Integer> {

}
