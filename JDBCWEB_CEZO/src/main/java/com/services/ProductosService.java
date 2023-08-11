package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.ProductosDAO;
import com.entity.Productos;
import com.general.Status;


@Path("productos")
public class ProductosService {
	

	Productos producto = null;
	ProductosDAO dao = null;
	String respuesta ="";
	
	
	
	/*
	 * Verbos
	 * GET -- Solo lectura
	 * POST -- Escritura
	 * PUT -- 
	 * DELETE -- 
	 * PATCH -- 
	 * 
	 */
	@SuppressWarnings("unchecked")
	@Path("Mostrar") //http://localhost:8090/JDBCWEB_CEZO/JDBCWEB_CEZO/productos/Mostrar
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Productos>mostrar(){
		dao = new ProductosDAO();
		return dao.mostrar();
		
	}

	
	@Path("guardar") //http://localhost:8090/JDBCWEB_CEZO/JDBCWEB_CEZO/productos/guardar
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status guardar(Productos producto) {
		Status status= new Status();
		status.setOb(producto);
		
		dao = new ProductosDAO();
		respuesta= dao.guardar(producto);
		
		if(respuesta.equals("1")) {
			status.setMensaje("Guardado con exito");
			status.setRespuesta(respuesta);
		}else {
			status.setMensaje("No fue posible guardar");
			status.setRespuesta(respuesta);
		}
		return status;
	}
	
	
	@Path("editar") //http://localhost:8090/JDBCWEB_CEZO/JDBCWEB_CEZO/productos/editar
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status editar(Productos producto) {
		Status status= new Status();
		status.setOb(producto);
		
		dao = new ProductosDAO();
		respuesta= dao.actualizar(producto);
		
		if(respuesta.equals("1")) {
			status.setMensaje("Guardado con exito");
			status.setRespuesta(respuesta);
		}else {
			status.setMensaje("No fue posible guardar");
			status.setRespuesta(respuesta);
		}
		return status;
	}
	
	
	@Path("buscar-por-id/{id}") //http://localhost:8090/JDBCWEB_CEZO/JDBCWEB_CEZO/productos/buscar-por-id/{id}
	@GET	
	@Produces({MediaType.APPLICATION_JSON})
	public Productos buscar(@PathParam("id")int id) {
		dao = new ProductosDAO();
		return (Productos) dao.buscar(id);
		
	}
	
	
	
	@Path("eliminar/{id}")//http://localhost:8090/JDBCWEB_CEZO/JDBCWEB_CEZO/productos/eliminar/{id}
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Status eliminar(@PathParam("id")int id){
		
		Status status = new Status();
		dao = new ProductosDAO();
	
		respuesta = dao.eliminar(id);
	
		if(respuesta.equals("1")) {
			
			status.setMensaje("Eliminado");
			status.setRespuesta(respuesta);
		}else {
			status.setMensaje("no se pudo guardar");
			status.setRespuesta(respuesta);
		}
	
		return status;
	}
	

}
