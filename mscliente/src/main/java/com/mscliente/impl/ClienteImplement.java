package com.mscliente.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Persistence.entity.Cliente;
import com.Persistence.repository.ClienteRepository;
import com.Persistence.request.ClienteRequest;
import com.mscliente.service.ClienteService;




@Service
public class ClienteImplement implements ClienteService{
	
	@Autowired
	ClienteRepository repo;

	@Override
	public Cliente guardar(ClienteRequest request) {
		Cliente cliente=new Cliente();
		
		//cliente.setClienteId(cliente.getClienteId());
		cliente.setNombre(request.getNombre());
		cliente.setFechanacimiento(request.getFechanacimiento());
		cliente.setDomicilio(request.getDomicilio());
		
	    repo.save(cliente);
		return cliente;
	}

	@Override
	public Cliente actualizar(ClienteRequest request) {
		Cliente cliente=repo.findById(request.getClienteId()).get();
		cliente.setClienteId(request.getClienteId());
		cliente.setNombre(request.getNombre());
		cliente.setFechanacimiento(request.getFechanacimiento());
		cliente.setDomicilio(request.getDomicilio());
		
	    repo.save(cliente);
		return cliente;
	}

	@Override
	public Cliente buscar(int id) {
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
