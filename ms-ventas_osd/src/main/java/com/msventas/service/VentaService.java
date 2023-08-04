package com.msventas.service;

import java.util.List;

import com.persistence.entity.Ventas;
import com.persistence.request.VentaRequest;

//Interface de logistica de negocio

//Que operaciones particulares del negocio se van a resolver
public interface VentaService {
	
	Ventas guardar(VentaRequest request);
	Ventas actualizar(VentaRequest request);
	Ventas buscar(int id);
	String eliminar(int id);
	List mostrar();
	

}
