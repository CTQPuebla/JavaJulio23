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
import com.dao.ProductosDAO;
import com.dto.DetallesProductoDTO;
import com.dto.DetellesEmpleadoDTO;
import com.entity.Autos;
import com.general.Status;

@Path("autos")
public class AutoService {
	
	Autos auto=null;
	AutoDAO dao= null;
	String respuesta ="";
	
	
	/*
	 * VERBOS
	 * GET --solo lectura
	 * POST --escritura
	 * PUT
	 * DELETE
	 * PATCH
	 */
	@Path("mostrar")// http://localhost:8090/JDBCWeb_ECGC/JDBCWeb_ECGC/autos/mostrar
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Autos>mostrar(){
		dao = new AutoDAO();
		return dao.mostrar();
	}
	@Path("detalles-productos")// http://localhost:8090/JDBCWeb_ECGC/JDBCWeb_ECGC/autos/mostrar
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<DetallesProductoDTO>detallesProductos(){
		dao = new AutoDAO();
		return dao.mostrar();
	}
//	@Path("detalles-productos")// http://localhost:8090/JDBCWeb_ECGC/JDBCWeb_ECGC/productos/detalles-productos
//	@GET
//	@Produces({MediaType.APPLICATION_JSON})
//	public List<DetellesEmpleadoDTO>detellesempleadoDTO(){
//		dao = new ProductosDAO();
//		return dao.DetellesEmpleadoDTO();
//	}
	@Path("guardar")// http://localhost:8090/JDBCWeb_ECGC/JDBCWeb_ECGC/autos/guardar
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status guardar(Autos auto) {
		Status status=new Status();
		status.setOb(auto);
		
		dao = new AutoDAO();
		respuesta=dao.guardar(auto);
		
		if(respuesta.equals("1")) {
			status.setMensaje("Guardado exitoso");
			status.setRespuesta(respuesta);
		}else {
			status.setMensaje("no fue posible guardar");
			status.setRespuesta(respuesta);
		}		
		return status;
	}
	@Path("editar")// http://localhost:8090/JDBCWeb_ECGC/JDBCWeb_ECGC/autos/editar
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status editar(Autos auto) {
		Status status=new Status();
		status.setOb(auto);
		
		dao = new AutoDAO();
		respuesta=dao.actualizar(auto);
		
		if(respuesta.equals("1")) {
			status.setMensaje("Actualizado exitoso");
			status.setRespuesta(respuesta);
		}else {
			status.setMensaje("no fue posible Actualizar");
			status.setRespuesta(respuesta);
		}
       return status;
	}
	@Path("buscar-por-id/{id}")// http://localhost:8090/JDBCWeb_ECGC/JDBCWeb_ECGC/autos/buscar-por-id/5
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Autos buscar(@PathParam("id") int id) {
		dao=new AutoDAO();
		return (Autos)dao.buscar(id);
	}
	@Path("eliminar-id/{id}")// http://localhost:8090/JDBCWeb_ECGC/JDBCWeb_ECGC/autos/eliminar-id/5
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Status eliminar(@PathParam("id") int id) {
		Status status = new Status();
		dao=new AutoDAO();
		
		respuesta = dao.eliminar(id);
		
		if(respuesta.contentEquals("1")){
				status.setMensaje("Eliminado OK");
				status.setRespuesta(respuesta);
		}else {
			status.setMensaje("no fue posible eliminar");
			status.setRespuesta(respuesta);
		}
		
		return status;
	}
}