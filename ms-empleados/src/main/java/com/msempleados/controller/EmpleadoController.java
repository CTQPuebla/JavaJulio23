package com.msempleados.controller;

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

import com.msempleados.impl.EmpleadoImplement;
import com.persistence.entity.Empleados;
import com.persistence.request.EmpleadoRequest;


@RestController
@RequestMapping("empleados/")
public class EmpleadoController {

	@Autowired
	EmpleadoImplement service;
	
	
	//http://localhost:8092/empleados/mostrar-todos
	@GetMapping("mostrar-todos")
	public ResponseEntity<List<Empleados>> listar() {
		List<Empleados>list= service.mostrar();
		return new ResponseEntity<List<Empleados>>(list, HttpStatus.OK);
	}
	
	

	//http://localhost:8092/empleados/buscar-por-id/5
	
	@GetMapping("buscar-por-id/{id}")
	public ResponseEntity<Empleados> buscar(@PathVariable int id){
		Empleados e= service.buscar(id);
		return new ResponseEntity<Empleados>(e,HttpStatus.OK);
	}
	
	//http://localhost:8092/empleados/guardar
		@PostMapping("guardar")
		public ResponseEntity<Empleados>guardar(@RequestBody EmpleadoRequest req){
			//System.out.println("Controller: " + req.getNombre());
			Empleados e=service.guardar(req);
			return new ResponseEntity<Empleados>(e, HttpStatus.OK);
		}
		
		//http://localhost:8092/empleados/actualizar
		@PutMapping("actualizar")
		public ResponseEntity<Empleados>actualizar(@RequestBody EmpleadoRequest req){
			//System.out.println("Controller: " + req.getNombre());
			Empleados e=service.actualizar(req);
			return new ResponseEntity<Empleados>(e, HttpStatus.OK);
		}
		
		//http://localhost:8092/empleados/eliminar/5
		@DeleteMapping("eliminar/{id}")
		public ResponseEntity<String>eliminar(@PathVariable int id){
			String mensaje=service.eliminar(id);
			return new ResponseEntity<String>(mensaje, HttpStatus.OK);
		}
}
