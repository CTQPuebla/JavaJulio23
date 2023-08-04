package com.msclientes.service;

import java.util.List;

import com.persistence.entity.Clientes;
import com.persistence.request.ClienteRequest;

//Interface de logica de negocio

//Que operaciones particulares del negocio se van a resolver
public interface ClienteService {
	
	Clientes guardar(ClienteRequest request);
	Clientes actualizar(ClienteRequest request);
	Clientes buscar(int id);
	String eliminar(int id);
	List mostrar();
	

}
