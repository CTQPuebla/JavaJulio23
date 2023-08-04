package com.msclientes.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msclientes.service.ClienteService;
import com.persistence.entity.Clientes;
import com.persistence.entity.Empleados;
import com.persistence.repository.ClientesRepository;
import com.persistence.repository.EmpleadoRepository;
import com.persistence.request.ClienteRequest;

@Service
public class ClienteImplement implements ClienteService {

	@Autowired
	ClientesRepository repo;
	
	
	@Override
	public Clientes guardar(ClienteRequest request) {
		Clientes cliente=new Clientes();
		
		cliente.setClienteId(request.getClienteId());
		cliente.setNombre(request.getNombre());
		cliente.setFechanac(request.getFechanac());
		cliente.setDomicilio(request.getDomicilio());
		
		
		repo.save(cliente);
		return cliente;
	}

	@Override
	public Clientes actualizar(ClienteRequest request) {
		Clientes cliente=repo.findById(request.getClienteId()).get();
		cliente.setClienteId(request.getClienteId());
		cliente.setNombre(request.getNombre());
		cliente.setFechanac(request.getFechanac());
		cliente.setDomicilio(request.getDomicilio());
		
		repo.save(cliente);
		return cliente;
	}

	@Override
	public Clientes buscar(int id) {
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
