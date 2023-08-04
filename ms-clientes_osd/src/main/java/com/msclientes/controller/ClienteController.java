package com.msclientes.controller;

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

import com.msclientes.impl.ClienteImplement;
import com.persistence.entity.Clientes;
import com.persistence.request.ClienteRequest;

@RestController
@RequestMapping("clientes/")
public class ClienteController {
	
	@Autowired
	ClienteImplement service;
	//http://localhost:8091/clientes/mostrar-todos
	@GetMapping("mostrar-todos")
	public ResponseEntity<List<Clientes>> listar(){
		List<Clientes> list = service.mostrar();
		return new ResponseEntity<List<Clientes>>(list, HttpStatus.OK);
	}
	
	//http://localhost:8091/clientes/buscar-por-id/5
	@GetMapping("buscar-por-id/{id}")
	public ResponseEntity<Clientes> buscar(@PathVariable int id){
		Clientes e = service.buscar(id);
		return new ResponseEntity<Clientes>(e, HttpStatus.OK);
	}
	
	//http://localhost:8091/clientes/guardar
	@PostMapping("guardar")
	public ResponseEntity<Clientes> guardar(@RequestBody ClienteRequest req){
		System.out.println("Controller " + req.getNombre());
		Clientes e = service.guardar(req);
		return new ResponseEntity<Clientes>(e, HttpStatus.OK);
	}
	
	
	//http://localhost:8091/clientes/actualizar
		@PutMapping("actualizar")
		public ResponseEntity<Clientes> actualizar(@RequestBody ClienteRequest req){
		System.out.println("Controller: " + req.getNombre());
		Clientes e = service.actualizar(req);
		return new ResponseEntity<Clientes>(e, HttpStatus.OK);
		}
		
		
		
		//http://localhost:8091/clientes/eliminar
		@DeleteMapping("eliminar/{id}")
		public ResponseEntity<String> eliminar(@PathVariable int id){
			String mensaje = service.eliminar(id);
			return new ResponseEntity<String>(mensaje, HttpStatus.OK);
		}

}
