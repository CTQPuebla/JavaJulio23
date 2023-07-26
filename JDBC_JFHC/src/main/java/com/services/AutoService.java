package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.AutoDao;
import com.entity.Autos;
import com.general.Status;

import comDTO.DetallesDTO;
import comDTO.DetallesProductoDTO;

@Path("autos")
public class AutoService {
	
	Autos auto = null;
	AutoDao dao= null;
	String respuesta="";
	/*
	 * VERBOS
	 * GET-- solo lectura
	 * POST-- escritura
	 * PUT
	 * DELETE
	 * PATH
	 */
	
	@Path("mostrar") //http://localhost:8090/JDBC_JFHC/JDBC_JFHC/autos/mostrar
	//endpoint
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Autos>mostrar(){
		dao= new AutoDao();
		return dao.mostrar();
	}
	@Path("detalles-productos") //http://localhost:8090/JDBC_JFHC/JDBC_JFHC/autos/detalles-productos
	//endpoint
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<DetallesProductoDTO>detallesproductos(){
		dao= new AutoDao();
		return dao.detallesProductos();
	}
	
	@Path("detalles-prod") //http://localhost:8090/JDBC_JFHC/JDBC_JFHC/autos/detalles-prod
	//endpoint
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<DetallesDTO>detallesproducto(){
		dao= new AutoDao();
		return dao.detallesProducto();
	}
	
	@Path("guardar") //http://localhost:8090/JDBC_JFHC/JDBC_JFHC/autos/guardar
	@POST
	@Consumes({MediaType.APPLICATION_JSON})  
	@Produces({MediaType.APPLICATION_JSON})
	public Status guardar(Autos auto) {
		Status status= new Status();
		status.setOb(auto);
				
		dao = new AutoDao();
		respuesta =dao.guardar(auto);
		
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
	public Status editar(Autos auto) {
		Status status= new Status();
		status.setOb(auto);
				
		dao = new AutoDao();
		respuesta =dao.actualizar(auto);
		
		if(respuesta.equals("1")) {
			status.setMensaje("Guardado exitoso");
			status.setRespuesta(respuesta);
			
		}else {
			status.setMensaje("No fue posible guardar");
			status.setRespuesta(respuesta);
		}
		
		return  status;
	}
	@Path("buscar-por-id/{id}") //http://localhost:8090/JDBC_JFHC/JDBC_JFHC/autos/buscar-por-id/5
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	
	public Autos buscar(@PathParam("id")int id ) {
		
		dao= new AutoDao();
		return (Autos) dao.buscar(id);
		
	}
	@Path("eliminar/{id}") //http://localhost:8090/JDBC_JFHC/JDBC_JFHC/autos/eliminar/
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Status eliminar (@PathParam("id")int id) {
		Status status = new Status();
		dao= new AutoDao();
		
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
