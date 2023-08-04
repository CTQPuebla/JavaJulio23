package com.msempleados.service;

import java.util.List;

import com.Persistence.entity.Empleados;
import com.Persistence.request.EmpleadosRequest;



public interface EmpleadoService {
	
	Empleados guardar(EmpleadosRequest request);
	Empleados actualizar(EmpleadosRequest request);
	Empleados buscar(int id);
	String eliminar(int id);
	List mostrar();

}
