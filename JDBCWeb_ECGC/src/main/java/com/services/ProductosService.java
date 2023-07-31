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
import com.entity.Productos;
import com.general.Status;

@Path("productos")
public class ProductosService {
	Productos producto=null;
	ProductosDAO dao=null;
	String respuesta = "";

	
	@Path("mostrar")// http://localhost:8090/JDBCWeb_ECGC/JDBCWeb_ECGC/productos/mostrar
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Productos>mostrar(){
		dao = new ProductosDAO();
		return dao.mostrar();
	}
	@Path("detalles-productos")// http://localhost:8090/JDBCWeb_ECGC/JDBCWeb_ECGC/productos/detalles-productos
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<DetellesEmpleadoDTO>detellesempleadoDTO(){
		dao = new ProductosDAO();
		return dao.DetellesEmpleadoDTO();
	}
	@Path("guardar")// http://localhost:8090/JDBCWeb_ECGC/JDBCWeb_ECGC/productos/guardar
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status guardar(Productos producto) {
		Status status=new Status();
		status.setOb(producto);
		
		dao = new ProductosDAO();
		respuesta=dao.guardar(producto);
		
		if(respuesta.equals("1")) {
			status.setMensaje("Guardado exitoso");
			status.setRespuesta(respuesta);
		}else {
			status.setMensaje("no fue posible guardar");
			status.setRespuesta(respuesta);
		}		
		return status;
	}
	@Path("editar")// http://localhost:8090/JDBCWeb_ECGC/JDBCWeb_ECGC/productos/editar
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status editar(Productos producto) {
		Status status=new Status();
		status.setOb(producto);
		
		dao = new ProductosDAO();
		respuesta=dao.actualizar(producto);
		
		if(respuesta.equals("1")) {
			status.setMensaje("Actualizado exitoso");
			status.setRespuesta(respuesta);
		}else {
			status.setMensaje("no fue posible Actualizar");
			status.setRespuesta(respuesta);
		}
       return status;
	}
	@Path("buscar-por-id/{id}")// http://localhost:8090/JDBCWeb_ECGC/JDBCWeb_ECGC/productos/buscar-por-id/22
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Productos buscar(@PathParam("id") int id) {
		dao=new ProductosDAO();
		return (Productos)dao.buscar(id);
	}
	@Path("eliminar-id/{id}")// http://localhost:8090/JDBCWeb_ECGC/JDBCWeb_ECGC/productos/eliminar-id/5
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Status eliminar(@PathParam("id") int id) {
		Status status = new Status();
		dao=new ProductosDAO();
		
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