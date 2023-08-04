package com.msempleados.service;

import java.util.List;

import com.persistence.entity.Empleados;
import com.persistence.request.EmpleadoRequest;

//Interface de logica de negocio

//Que operaciones particulares del negocio se van a resolver
public interface EmpleadoService {
	
	Empleados guardar(EmpleadoRequest request);
	Empleados actualizar(EmpleadoRequest request);
	Empleados buscar(int id);
	String eliminar(int id);
	List mostrar();
	

}
