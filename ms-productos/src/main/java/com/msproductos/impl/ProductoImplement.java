package com.msproductos.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msproductos.entity.Departamentos;
import com.msproductos.entity.Productos;
import com.msproductos.exceptions.BussinesExceptions;
import com.msproductos.exceptions.ResourseNotFoundExceptions;
import com.msproductos.repository.DepartamentosRepository;
import com.msproductos.repository.ProductoRepository;
import com.msproductos.request.ProductoRequest;
import com.msproductos.service.ProductoService;

//Clase de resolucion de logica de negocio
@Service
public class ProductoImplement implements ProductoService {

//Inyeccion de dependencias

	@Autowired
	ProductoRepository repo; // Inyeccion por atributo

	// 2-por setter
	// 3-por constructor
	
	@Autowired
	DepartamentosRepository deptoRep;

	@Override
	public Productos guardar(ProductoRequest request) {
		Productos producto = null;

		int conteo = repo.buscarPorNombre(request.getNombre());
		Optional <Departamentos> dep = deptoRep.findById(request.getDeptoId());
		//validar que exista el departamento al cual se lo voy a relacionar

		
		//Valido que no exista un producto con el mismo nombre
		if (conteo > 0) {
			System.out.println("Ya existe un producto con ese nombre");		}
		throw new BussinesExceptions("");
		
		else if(dep.isPresent()) {//Validar que exista rl departamento al que lo voy a relacionar 
			producto = new Productos();
			producto.setDeptoId(request.getDeptoId());
			producto.setNombre(request.getNombre());
			producto.setFechacaducidad(request.getFechacaducidad());
			producto.setPreciocompra(request.getPreciocompra());
			producto.setPrecioventa(request.getPrecioventa());
			producto.setRefrigerado(request.getRefrigerado());

			repo.save(producto);
			
		}
		
		else  {

			System.out.println("El departamento no existe");
			throw new  ResourseNotFoundExceptions("No existe tal departamento");
			

		}

		return producto;

	}

	@Override
	public Productos actualizar(ProductoRequest request) {
		Productos producto = repo.findById(request.getProductoId()).get();

		producto.setDeptoId(request.getDeptoId());
		producto.setNombre(request.getNombre());
		producto.setFechacaducidad(request.getFechacaducidad());
		producto.setPreciocompra(request.getPreciocompra());
		producto.setPrecioventa(request.getPrecioventa());
		producto.setRefrigerado(request.getRefrigerado());

		repo.save(producto);
		return producto;
	}

	@Override
	public Productos buscar(int id) {

		return repo.findById(id).get();
	}

	@Override
	public String eliminar(int id) {
		repo.deleteById(id);
		return "Eliminado";
	}

	@Override
	public List mostrar() {

		return repo.findAll();
	}

}
