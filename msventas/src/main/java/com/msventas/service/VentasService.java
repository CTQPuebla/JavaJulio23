package com.msventas.service;

import java.util.List;


import com.Persistence.entity.Ventas;

import com.Persistence.request.VentasRequest;

public interface VentasService {
	Ventas guardar(VentasRequest request);
	Ventas actualizar(VentasRequest request);
	Ventas buscar(int id);
	String eliminar(int id);
	List mostrar();

}
