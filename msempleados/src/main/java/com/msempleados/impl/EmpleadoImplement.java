package com.msempleados.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Persistence.entity.Empleados;
import com.Persistence.repository.EmpleadosRepository;
import com.Persistence.request.EmpleadosRequest;
import com.msempleados.service.EmpleadoService;



@Service
public class EmpleadoImplement implements EmpleadoService{
	
	@Autowired
	EmpleadosRepository repo;

	@Override
	public Empleados guardar(EmpleadosRequest request) {
      Empleados empleado=new Empleados();
		
		//empleado.setEmpleadoId(empleado.getEmpleadoId());
		empleado.setNombre(request.getNombre());
		empleado.setFechaingreso(request.getFechaingreso());
		empleado.setSalario(request.getSalario());
		
		repo.save(empleado);
		return empleado;
	}

	@Override
	public Empleados actualizar(EmpleadosRequest request) {
		Empleados empleado=repo.findById(request.getEmpleadoId()).get();
		empleado.setEmpleadoId(request.getEmpleadoId());
		empleado.setNombre(request.getNombre());
		empleado.setFechaingreso(request.getFechaingreso());
		empleado.setSalario(request.getSalario());
		
		repo.save(empleado);
		return empleado;
	}

	@Override
	public Empleados buscar(int id) {
		return repo.findById(id).get();
		
	}

	@Override
	public String eliminar(int id) {
		repo.deleteById(id);
		return"Eliminado";
	}

	@Override
	public List mostrar() {
		return repo.findAll();
	}

	
	
	
	

}
