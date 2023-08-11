package com.mscliente.service;

import java.util.List;

import com.Persistence.entity.Cliente;
import com.Persistence.request.ClienteRequest;



public interface ClienteService {
	Cliente guardar(ClienteRequest request);
	Cliente actualizar(ClienteRequest request);
	Cliente buscar(int id);
	String eliminar(int id);
	List mostrar();

}
