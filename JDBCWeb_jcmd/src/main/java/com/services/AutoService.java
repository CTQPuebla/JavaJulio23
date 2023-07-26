package com.services;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.AutoDAO;
import com.entity.Autos;
import com.general.Status;
import com.dto.DetallesEmpleado;
import com.dto.DetallesProductoDTO;




@Path("autos")
public class AutoService {
	
	Autos auto = null;
	AutoDAO dao = null;
	String respuesta = "";
	
	/*
	 * VERBOS
	 * GET-----SOLO LECTURA
	 * POST----ESCRITURA8
	 * PUT
	 * DELETE
	 * PATCH
	 */
	
	
	

    @Path("mostrar")  //http://localhost:8090/JDBCWeb_jcmd/JDBCWeb_jcmd/autos/mostrar
    @GET
    @Produces({MediaType.APPLICATION_JSON})

	public List<Autos> mostrar(){
		dao = new AutoDAO();
		return dao.mostrar();
		
	}


    @Path("guardar")  //http://localhost:8090/JDBCWeb_jcmd/JDBCWeb_jcmd/autos/guardar
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    
	public Status guardar (Autos auto) {
		Status status = new Status();
		status.setOb(auto);
		
		dao= new AutoDAO();
		respuesta = dao.guardar(auto);
		
		if (respuesta.equals("1")) {
			status.setMensaje("Guardado exitoso");
			status.setRespuesta(respuesta);
			
		}else {
			status.setMensaje("No fue posible guardar");
			status.setRespuesta(respuesta);
		}
	
		return status;
	}
    
    
    
    @Path("editar")  //http://localhost:8090/JDBCWeb_jcmd/JDBCWeb_jcmd/autos/editar
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
	public Status editar (Autos auto) {
		Status status = new Status();
		status.setOb(auto);
		
		dao= new AutoDAO();
		respuesta = dao.actualizar(auto);
		
		if (respuesta.equals("1")) {
			status.setMensaje("Actualizado exitoso");
			status.setRespuesta(respuesta);
			
		}else {
			status.setMensaje("No fue posible actualizar");
			status.setRespuesta(respuesta);
		}
	
		return status;
	}
	
    @Path("buscar-por-id/{id}")  //http://localhost:8090/JDBCWeb_jcmd/JDBCWeb_jcmd/autos/buscar-por-id/5
    @GET
    @Produces({MediaType.APPLICATION_JSON})
	public Autos buscar(@PathParam ("id")int id) {
		dao = new AutoDAO();
		return (Autos) dao.buscar(id);//se agrego el casteo
	}
	
    @Path("eliminar/{id}")  //http://localhost:8090/JDBCWeb_jcmd/JDBCWeb_jcmd/autos/eliminar/5
    @GET
    @Produces({MediaType.APPLICATION_JSON})
	public Status eliminar(@PathParam ("id")int id) {
		
		Status status = new Status();
		dao = new AutoDAO();
		
		respuesta = dao.eliminar(id);
		if (respuesta.equals("1")) {
			status.setMensaje("Eliminado OK");
			status.setRespuesta(respuesta);
		}else {
			status.setMensaje("Error");
			status.setRespuesta(respuesta);
		}
		
		return status;
	}
    
    
    @Path("detalles-productos")  //http://localhost:8090/JDBCWeb_jcmd/JDBCWeb_jcmd/autos/detalles-productos
    @GET
    @Produces({MediaType.APPLICATION_JSON})

	public List<DetallesProductoDTO> detallesProductos(){
		dao = new AutoDAO();
		return dao.detallesProductos();
		
	}
    
    @Path("detalles-empleados")  //http://localhost:8090/JDBCWeb_jcmd/JDBCWeb_jcmd/autos/detalles-empleados
    @GET
    @Produces({MediaType.APPLICATION_JSON})

	public List<DetallesEmpleado> detallesEmpleados(){
		dao = new AutoDAO();
		return dao.detallesEmpleado();
		
	}

}
