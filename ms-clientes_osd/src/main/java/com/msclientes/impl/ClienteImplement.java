package com.msclientes.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msclientes.service.ClienteService;
import com.persistence.entity.Clientes;
import com.persistence.repository.ClienteRepository;
import com.persistence.request.ClienteRequest;

//Clase de resolucion de logica de negocio
@Service
public class ClienteImplement implements ClienteService{
	
	//Inyeccion de dependencias
	@Autowired
	ClienteRepository repo;

	@Override
	public Clientes guardar(ClienteRequest request) {
		Clientes cliente = new Clientes();
		
		cliente.setNombre(request.getNombre());
		cliente.setFechaNac(request.getFechaNac());
		cliente.setDomicilio(request.getDomicilio());
		
		repo.save(cliente);
		return cliente;
	}

	@Override
	public Clientes actualizar(ClienteRequest request) {
		Clientes cliente = repo.findById(request.getClienteId()).get();
		
		cliente.setNombre(request.getNombre());
		cliente.setFechaNac(request.getFechaNac());
		cliente.setDomicilio(request.getDomicilio());
		
		repo.save(cliente);
		return cliente;
	}

	@Override
	public Clientes buscar(int id) {
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
