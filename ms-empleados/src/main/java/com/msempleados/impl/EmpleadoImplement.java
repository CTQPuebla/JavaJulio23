package com.msempleados.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msempleados.service.EmpleadoService;
import com.persistence.entity.Empleados;
import com.persistence.repository.EmpleadoRepository;
import com.persistence.request.EmpleadoRequest;

@Service
public class EmpleadoImplement implements EmpleadoService{
	//Inyeccion de dependencias
	@Autowired
	EmpleadoRepository repo;
	
	@Override
	public Empleados guardar(EmpleadoRequest request) {
		Empleados empleado = new Empleados();
		
		empleado.setNombre(request.getNombre());
		empleado.setFechaIngreso(request.getFechaIngreso());
		empleado.setSalario(request.getSalario());
		
		repo.save(empleado);
		return empleado;
	}

	@Override
	public Empleados actualizar(EmpleadoRequest request) {
		Empleados empleado = repo.findById(request.getEmpleadoId()).get();
		
		empleado.setNombre(request.getNombre());
		empleado.setFechaIngreso(request.getFechaIngreso());
		empleado.setSalario(request.getSalario());
		
		repo.save(empleado);
		return empleado;
	}

	@Override
	public Empleados buscar(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		repo.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List mostrar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
