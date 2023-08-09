package com.msproductos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.msproductos.entity.Productos;

@Repository //para consultas es como el DAO
public interface ProductoRepository extends JpaRepository<Productos, Integer>{
	
	@Query("SELECT COUNT(p.productoId) FROM Productos p WHERE p.nombre =:nombre")
	Integer buscarPorNombre(@Param("nombre")String nombre);
	
}
