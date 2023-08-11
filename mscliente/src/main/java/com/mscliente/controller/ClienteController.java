package com.mscliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Persistence.entity.Cliente;

import com.Persistence.request.ClienteRequest;
import com.mscliente.impl.ClienteImplement;



@RestController
@RequestMapping("clientes/")
public class ClienteController {
	
	@Autowired
	ClienteImplement service;
	
	@GetMapping("mostrar-todos")
	public ResponseEntity<List<Cliente>> listar() {
		List<Cliente>list= service.mostrar();
		return new ResponseEntity<List<Cliente>>(list, HttpStatus.OK);
	}
	@GetMapping("buscar-por-id/{id}")
	public ResponseEntity<Cliente> buscar(@PathVariable int id){
		Cliente e= service.buscar(id);
		return new ResponseEntity<Cliente>(e,HttpStatus.OK);
	}
	
	//http://localhost:8090/productos/guardar
	@PostMapping("guardar")
	public ResponseEntity<Cliente>guardar(@RequestBody ClienteRequest req){
		System.out.println("Controller: " + req.getNombre());
		Cliente e=service.guardar(req);
		return new ResponseEntity<Cliente>(e, HttpStatus.OK);
	}
	
	
	//http://localhost:8090/productos/actualizar
	@PutMapping("actualizar")
	public ResponseEntity<Cliente>actualizar(@RequestBody ClienteRequest req){
		System.out.println("Controller: " + req.getNombre());
		Cliente e=service.actualizar(req);
		return new ResponseEntity<Cliente>(e, HttpStatus.OK);
	}
	
	//http://localhost:8090/productos/eliminar/5
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<String>eliminar(@PathVariable int id){
		String mensaje=service.eliminar(id);
		return new ResponseEntity<String>(mensaje, HttpStatus.OK);
	}

	

}
