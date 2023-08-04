package com.msventas.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Persistence.entity.Cliente;
import com.Persistence.entity.DetVenta;
import com.Persistence.entity.Empleados;
import com.Persistence.entity.Ventas;
import com.Persistence.repository.ClienteRepository;
import com.Persistence.repository.DetVentaRepository;
import com.Persistence.repository.EmpleadosRepository;
import com.Persistence.repository.VentasRepository;
import com.Persistence.request.VentasRequest;
import com.msventas.service.VentasService;

@Service
public class VentaImplement implements VentasService {

	@Autowired
	VentasRepository repo;
	@Autowired
	ClienteRepository repo1;
	@Autowired
	EmpleadosRepository repo2;
	
	@Autowired
	DetVentaRepository dtvRepo;
	

	RestTemplate httpclient= new RestTemplate();
	
	@Override
	public Ventas guardar(VentasRequest request) {
		Ventas venta = new Ventas();
		// venta.setVentaId(venta.getVentaId());
		Cliente cliente = repo1.findById(request.getCliente().getClienteId()).get();
		//Empleados empleado = repo2.findById(request.getEmpleado().getEmpleadoId()).get();
		int clienteId=request.getCliente().getClienteId();
		Empleados empleado= httpclient.getForObject("http://localhost:8092/empleados/buscar-por-id/"+ clienteId, Empleados.class);		
		venta.setCliente(cliente);
		venta.setEmpleado(empleado);
		venta.setFechaventa(request.getFechaventa());
		venta.setSubtotal(request.getSubtotal());
		venta.setTotal(request.getTotal());
		repo.save(venta);		
		//Guardar los detalles de la venta, leyendo la longitud de la lista de detalles
		for (int i = 0; i < request.getProductos().size(); i++) {
			
			DetVenta dt = new DetVenta();
			dt.setVentaId(venta.getVentaId());
			dt.setProductoId(request.getProductos().get(i).getProductoId());
			dt.setCantidad(request.getProductos().get(i).getCantidad());
			
			dtvRepo.save(dt);
		}
		return venta;
	}

	@Override
	public Ventas actualizar(VentasRequest request) {
		Ventas venta = repo.findById(request.getVentaId()).get();
		Cliente cliente = repo1.findById(request.getCliente().getClienteId()).get();
		Empleados empleado = repo2.findById(request.getEmpleado().getEmpleadoId()).get();
		venta.setCliente(cliente);
		venta.setEmpleado(empleado);
		venta.setFechaventa(request.getFechaventa());
		venta.setSubtotal(request.getSubtotal());
		venta.setTotal(request.getTotal());

		repo.save(venta);
		return venta;
	}

	@Override
	public Ventas buscar(int id) {
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
