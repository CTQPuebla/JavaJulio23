package com.msproductos.service;

import java.util.List;

import com.msproductos.entity.Productos;
import com.msproductos.request.ProductoRequest;

//Interface de logica de negocio

//Que operaciones particulares del negocio se van a resolver
public interface ProductoService {
	
	Productos guardar(ProductoRequest request);
	Productos actualizar(ProductoRequest request);
	Productos buscar(int id);
	String eliminar(int id);
	List mostrar();
	
	
	
}
