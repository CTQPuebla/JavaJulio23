package com.msventas.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.msventas.service.VentaService;
import com.persistence.entity.Clientes;
import com.persistence.entity.DetalleVenta;
import com.persistence.entity.Empleados;
import com.persistence.entity.Ventas;
import com.persistence.repository.ClienteRepository;
import com.persistence.repository.DetalleVentaRepository;
import com.persistence.repository.EmpleadoRepository;
import com.persistence.repository.VentaRepository;
import com.persistence.request.VentaRequest;

//Clase de resolucion de logica de negocio
@Service
public class VentaImplement implements VentaService{
	//Inyeccion de dependencia
	@Autowired
	VentaRepository repo;
	@Autowired
	ClienteRepository repo2;
	@Autowired
	EmpleadoRepository repo3;
	@Autowired
	DetalleVentaRepository dtvRepo;
	
	RestTemplate httpclient = new RestTemplate();
	
	@Override
	public Ventas guardar(VentaRequest request) {
		Ventas venta = new Ventas();
		Clientes cliente = repo2.findById(request.getCliente().getClienteId()).get();
		//Empleados empleado = repo3.findById(request.getEmpleado().getEmpleadoId()).get();
		
		int clienteId=request.getCliente().getClienteId();
		Empleados empleado = httpclient.getForObject("http://localhost:8092/empleados/buscar-por-id/" + clienteId, Empleados.class);
		
		venta.setCliente(request.getCliente());
		venta.setEmpleado(request.getEmpleado());
		//venta.setEmpleadoId(request.getEmpleadoId());
		//venta.setClienteId(request.getClienteId());
		venta.setFechaVenta(request.getFechaVenta());
		venta.setSubtotal(request.getSubtotal());
		venta.setTotal(request.getTotal());
		repo.save(venta);
		
		//guardar los dettales de las ventas, leyendo la longitud de la lista de detalles
		for (int i = 0; i < request.getProductos().size(); i++) {
			
			DetalleVenta dt = new DetalleVenta();
			dt.setVentaId(venta.getVentaId());
			dt.setProductoId(request.getProductos().get(i).getProductoId());
			dt.setCantidad(request.getProductos().get(i).getCantidad());
			dtvRepo.save(dt);
		}
		return venta;
	}

	@Override
	public Ventas actualizar(VentaRequest request) {
		Ventas venta = repo.findById(request.getVentaId()).get();
		Clientes cliente = repo2.findById(request.getCliente().getClienteId()).get();
		Empleados empleado = repo3.findById(request.getEmpleado().getEmpleadoId()).get();
		
		venta.setCliente(cliente);
		venta.setEmpleado(empleado);
		//venta.setEmpleadoId(request.getEmpleadoId());
		//venta.setClienteId(request.getClienteId());
		venta.setFechaVenta(request.getFechaVenta());
		venta.setSubtotal(request.getSubtotal());
		venta.setTotal(request.getTotal());
		
		repo.save(venta);
		return venta;
	}

	@Override
	public Ventas buscar(int id) {
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
