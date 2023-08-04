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
import com.dto.ConsultaProductos;
import com.dto.DetallesProductoDTO;
import com.entity.Autos;
import com.general.Status;



@Path("autos")
public class AutoService {
	
	Autos auto = null;
	AutoDAO dao = null;
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
	@Path("mostrar") //http://localhost:8090/JDBCWEB_CEZO/JDBCWEB_CEZO/autos/mostrar
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Autos>mostrar(){
		dao = new AutoDAO();
		return dao.mostrar();
		
	}

	@Path("detalles-productos") //http://localhost:8090/JDBCWEB_CEZO/JDBCWEB_CEZO/autos/detalles-productos
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<DetallesProductoDTO>detallesProductos(){
		dao = new AutoDAO();
		return dao.detallesProductos();
		
	}
	
	@Path("consulta-prod") //http://localhost:8090/JDBCWEB_CEZO/JDBCWEB_CEZO/autos/consulta-prod
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<ConsultaProductos> consultaProductos(){
		dao = new AutoDAO();
		return dao.consultaProductos();
	}
	
	
	@Path("guardar") //http://localhost:8090/JDBCWEB_CEZO/JDBCWEB_CEZO/autos/guardar
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status guardar(Autos auto) {
		Status status= new Status();
		status.setOb(auto);
		
		dao = new AutoDAO();
		respuesta= dao.guardar(auto);
		
		if(respuesta.equals("1")) {
			status.setMensaje("Guardado con exito");
			status.setRespuesta(respuesta);
		}else {
			status.setMensaje("No fue posible guardar");
			status.setRespuesta(respuesta);
		}
		return status;
	}
	
	
	@Path("editar") //http://localhost:8090/JDBCWEB_CEZO/JDBCWEB_CEZO/autos/editar
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status editar(Autos auto) {
		Status status= new Status();
		status.setOb(auto);
		
		dao = new AutoDAO();
		respuesta= dao.actualizar(auto);
		
		if(respuesta.equals("1")) {
			status.setMensaje("Guardado con exito");
			status.setRespuesta(respuesta);
		}else {
			status.setMensaje("No fue posible guardar");
			status.setRespuesta(respuesta);
		}
		return status;
	}
	
	
	@Path("buscar-por-id/{id}") //http://localhost:8090/JDBCWEB_CEZO/JDBCWEB_CEZO/autos/buscar-por-id/{id}
	@GET	
	@Produces({MediaType.APPLICATION_JSON})
	public Autos buscar(@PathParam("id")int id) {
		dao = new AutoDAO();
		return (Autos) dao.buscar(id);
		
	}
	
	
	
	@Path("eliminar/{id}")//http://localhost:8090/JDBCWEB_CEZO/JDBCWEB_CEZO/autos/eliminar/{id}
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Status eliminar(@PathParam("id")int id){
		
		Status status = new Status();
		dao = new AutoDAO();
	
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
