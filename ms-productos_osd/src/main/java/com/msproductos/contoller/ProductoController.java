package com.msproductos.contoller;

import java.util.List;

import javax.validation.Valid;

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

import com.msproductos.entity.Productos;
import com.msproductos.impl.ProductoImplement;
import com.msproductos.request.ProductoRequest;

@RestController
@RequestMapping("productos/")
public class ProductoController {
	@Autowired
	ProductoImplement service;
	//http://localhost:8095/productos/mostrar-todos
	@GetMapping("mostrar-todos")
	public ResponseEntity<List<Productos>> listar(){
		List<Productos> list = service.mostrar();
		return new ResponseEntity<List<Productos>>(list, HttpStatus.OK);	
	}
	 
	//http://localhost:8095/productos/buscar-por-id/5
	@GetMapping("buscar-por-id/{id}")
	public ResponseEntity<Productos> buscar(@PathVariable int id){
		Productos e = service.buscar(id);
		return new ResponseEntity<Productos>(e, HttpStatus.OK);
	}
	
	
	//http://localhost:8095/productos/guardar
	@PostMapping("guardar")
	public ResponseEntity<Productos> guardar(@Valid @RequestBody ProductoRequest req){
		System.out.println("Controller " + req.getNombre());
		Productos e = service.guardar(req);
		return new ResponseEntity<Productos>(e, HttpStatus.OK);
	}
	
	
	//http://localhost:8095/productos/actualizar
	@PutMapping("actualizar")
	public ResponseEntity<Productos> actualizar(@Valid @RequestBody ProductoRequest req){
	System.out.println("Controller: " + req.getNombre());
	Productos e = service.actualizar(req);
	return new ResponseEntity<Productos>(e, HttpStatus.OK);
	}
	
	
	
	//http://localhost:8095/productos/eliminar
	@DeleteMapping("eliminar/{id}")
	public ResponseEntity<String> eliminar(@PathVariable int id){
		String mensaje = service.eliminar(id);
		return new ResponseEntity<String>(mensaje, HttpStatus.OK);
	}
	
	
}
