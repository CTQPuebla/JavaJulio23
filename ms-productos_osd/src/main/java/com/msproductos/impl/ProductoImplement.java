package com.msproductos.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msproductos.entity.Departamentos;
import com.msproductos.entity.Productos;
import com.msproductos.exceptions.BusinessException;
import com.msproductos.exceptions.ResourceNotFoundException;
import com.msproductos.repository.DepartamentoRepository;
import com.msproductos.repository.ProductoRepository;
import com.msproductos.request.ProductoRequest;
import com.msproductos.service.ProductoService;

//Clase de resolucion de logica de negocio
@Service
public class ProductoImplement implements ProductoService{
	
	//Inyeccion de dependencias
	@Autowired
	ProductoRepository repo;  //Inyeccion de dependencia por atributo
	// 2.- por setter
	// 3.- por constructor 
	@Autowired
	DepartamentoRepository detoRep;
	
	
	@Override
	public Productos guardar(ProductoRequest request) {
		Productos producto=null;
		int conteo = repo.buscarPorNombre(request.getNombre());
				
		Optional<Departamentos> dep = detoRep.findById(request.getDeptoId());		
		//Valido que no exista un producto con el mismo nombre
		if (conteo>0) {
			System.out.println("Ya existe un producto con ese nombre");
			throw new BusinessException("Ya existe un producto con ese nombre");
		}else if(dep.isPresent()){ //Validar que exista el departamento al cual se lo voy a relacionar
			//Productos producto = new Productos();
			producto = new Productos();
			producto.setDeptoId(request.getDeptoId());
			producto.setNombre(request.getNombre());
			producto.setFechaCad(request.getFechaCad());
			producto.setPrecioCompra(request.getPrecioCompra());
			producto.setPrecioVenta(request.getPrecioVenta());
			producto.setRefrigerado(request.getRefrigerado());
			
			repo.save(producto);
			
		}else {			
			System.out.println("El departamento no existe");
			throw new ResourceNotFoundException("No existe tal departamento");
		}
		return producto;
	}

	@Override
	public Productos actualizar(ProductoRequest request) {
		Productos producto = repo.findById(request.getProductoId()).get();
		
		producto.setDeptoId(request.getDeptoId());
		producto.setNombre(request.getNombre());
		producto.setFechaCad(request.getFechaCad());
		producto.setPrecioCompra(request.getPrecioCompra());
		producto.setPrecioVenta(request.getPrecioVenta());
		producto.setRefrigerado(request.getRefrigerado());
		
		repo.save(producto);
		return producto;
	}

	@Override
	public Productos buscar(int id) {
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
