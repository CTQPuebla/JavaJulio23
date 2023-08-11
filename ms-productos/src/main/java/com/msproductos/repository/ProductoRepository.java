package com.msproductos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.msproductos.entity.Productos;

@Repository
public interface ProductoRepository extends JpaRepository<Productos, Integer>{
//Es el DAO, hace las consultas	
	

	@Query("SELECT COUNT(p.productoId) FROM Productos p WHERE p.nombre =:nombre") //JPQL
	Integer buscarPorNombre(@Param("nombre")String nombre);
	
//	@Query("SELECT COUNT(p.refrigerado) FROM Productos p WHERE p.refrigerado =:refrigerado") //JPQL
//	Integer refrigerado(@Param("nombre")String nombre);
	
}
