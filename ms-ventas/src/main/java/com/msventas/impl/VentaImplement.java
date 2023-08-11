package com.msventas.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.msventas.service.VentaService;
import com.persistence.entity.Clientes;
import com.persistence.entity.Det_Venta;
import com.persistence.entity.Empleados;
import com.persistence.entity.Ventas;
import com.persistence.repository.ClientesRepository;
import com.persistence.repository.Det_VentaRepository;
import com.persistence.repository.EmpleadoRepository;
import com.persistence.repository.VentasRepository;
import com.persistence.request.VentaRequest;

@Service
public class VentaImplement implements VentaService {

	
	@Autowired
	VentasRepository repo;
	
	@Autowired
	ClientesRepository repo1;
	
	@Autowired
	EmpleadoRepository repo2;
	
	@Autowired
	Det_VentaRepository dtvRepo;
	
	RestTemplate httpclient= new RestTemplate();
	
	@Override
	public Ventas guardar(VentaRequest request) {
     Ventas venta=new Ventas();
     
     Clientes cliente= repo1.findById(request.getCliente().getClienteId()).get();
     //Empleados empleado=repo2.findById(request.getEmpleado().getEmpleadoId()).get();  
     int clienteid=request.getCliente().getClienteId();
     Empleados empleado= httpclient.getForObject("http://localhost:8092/empleados/buscar-por-id/"+clienteid, Empleados.class);
        
        venta.setCliente(cliente);
        venta.setEmpleado(empleado);
		venta.setVentaId(request.getVentaId());
		venta.setFechaventa(request.getFechaventa());
		venta.setSubtotal(request.getSubtotal());
		venta.setTotal(request.getTotal());
		repo.save(venta);
		
		
		for(int i = 0; i < request.getProducto().size(); i++) {
			Det_Venta dt=new Det_Venta();
			dt.setDetventaId(venta.getVentaId());
			dt.setProductoId(request.getProducto().get(i).getProductoID());
			dt.setCantidad(request.getProducto().get(i).getCantida());
			
			dtvRepo.save(dt);
		}
		return venta;	
		
	}

	@Override
	public Ventas actualizar(VentaRequest request) {
		Ventas venta=repo.findById(request.getVentaId()).get();
		 Clientes cliente= repo1.findById(request.getCliente().getClienteId()).get();
	     Empleados empleado=repo2.findById(request.getEmpleado().getEmpleadoId()).get();  
		venta.setVentaId(request.getVentaId());
		venta.setEmpleado(empleado);
		venta.setCliente(cliente);
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
		return"Eliminado";
	}

	@Override
	public List mostrar() {
		return repo.findAll();
	}

}
