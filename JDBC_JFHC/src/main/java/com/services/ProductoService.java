package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.ProductosDao;
import com.entity.Productos;
import com.general.Status;

@Path("productos")
public class ProductoService {
	
	Productos producto = null;
	ProductosDao dao= null;
	String respuesta="";
	/*
	 * VERBOS
	 * GET-- solo lectura
	 * POST-- escritura
	 * PUT
	 * DELETE
	 * PATH
	 */
	
	@Path("mostrar") //http://localhost:8090/JDBC_JFHC/JDBC_JFHC/productos/mostrar
	//endpoint
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Productos>mostrar(){
		dao= new ProductosDao();
		return dao.mostrar();
	}
	
	@Path("guardar") //http://localhost:8090/JDBC_JFHC/JDBC_JFHC/productos/guardar
	@POST
	@Consumes({MediaType.APPLICATION_JSON})  
	@Produces({MediaType.APPLICATION_JSON})
	public Status guardar(Productos producto) {
		Status status= new Status();
		status.setOb(producto);
				
		dao = new ProductosDao();
		respuesta =dao.guardar(producto);
		
		if(respuesta.equals("1")) {
			status.setMensaje("Guardado exitoso");
			status.setRespuesta(respuesta);
			
		}else {
			status.setMensaje("No fue posible guardar");
			status.setRespuesta(respuesta);
		}
		
		return  status;
	}
	
	@Path("editar") //http://localhost:8090/JDBC_JFHC/JDBC_JFHC/autos/editar
	@POST
	@Consumes({MediaType.APPLICATION_JSON})  
	@Produces({MediaType.APPLICATION_JSON})
	public Status editar(Productos producto) {
		Status status= new Status();
		status.setOb(producto);
				
		dao = new ProductosDao();
		respuesta =dao.actualizar(producto);
		
		if(respuesta.equals("1")) {
			status.setMensaje("Guardado exitoso");
			status.setRespuesta(respuesta);
			
		}else {
			status.setMensaje("No fue posible guardar");
			status.setRespuesta(respuesta);
		}
		
		return  status;
	}
	@Path("buscar-por-id/{id}") //http://localhost:8090/JDBC_JFHC/JDBC_JFHC/productos/buscar-por-id/5
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	
	public Productos buscar(@PathParam("id")int id ) {
		
		dao= new ProductosDao();
		return (Productos) dao.buscar(id);
		
	}
	@Path("eliminar/{id}") //http://localhost:8090/JDBC_JFHC/JDBC_JFHC/autos/eliminar/
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Status eliminar (@PathParam("id")int id) {
		Status status = new Status();
		dao= new ProductosDao();
		
		respuesta= dao.eliminar(id);
		if(respuesta.contentEquals("1")) {
			status.setMensaje("Eliminado ok");
			status.setRespuesta(respuesta);
		}else {
			status.setMensaje("Error");
			status.setRespuesta(respuesta);
		}
		return status;
		
	}

}
