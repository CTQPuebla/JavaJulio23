package com.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import com.dao.ProductoDAO;

import com.entity.Productos;
import com.general.Status;

@Path("productos/")
public class ProductosService {

	Productos producto = null;
	ProductoDAO dao = null;
	String respuesta = "";

	/*
	 * VERBOS GET--- SOLO LECTURA POST---ESCRITURA PUT DELETE PATCH
	 * 
	 */

	@Path("mostrar") // http://localhost:8090/JDBCWeb_CJHM/JDBCWeb_CJHM/productos/mostrar
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Productos> mostrar() {
		dao = new ProductoDAO();
		return dao.mostrar();
	}

	@Path("guardar") // http://localhost:8090/JDBCWeb_CJHM/JDBCWeb_CJHM/productos/guardar
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public Status guardar(Productos producto) {
		Status status = new Status();
		status.setOb(producto);

		dao = new ProductoDAO();
		respuesta = dao.guardar(producto);

		if (respuesta.equals("1")) {
			status.setMensaje("Guardado exitoso");
			status.setRespuesta(respuesta);
		} else {
			status.setMensaje("No fue posible guardar");
			status.setRespuesta(respuesta);
		}

		return status;
	}

	@Path("editar") // http://localhost:8090/JDBCWeb_CJHM/JDBCWeb_CJHM/productos/editar
	@POST
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })

	public Status editar(Productos producto) {
		Status status = new Status();
		status.setOb(producto);

		dao = new ProductoDAO();
		respuesta = dao.actualizar(producto);

		if (respuesta.equals("1")) {
			status.setMensaje("Actualizado exitoso");
			status.setRespuesta(respuesta);
		} else {
			status.setMensaje("No fue posible actualizar");
			status.setRespuesta(respuesta);
		}

		return status;
	}

	@Path("buscar-por-id/{id}") // http://localhost:8090/JDBCWeb_CJHM/JDBCWeb_CJHM/productos/buscar-por-id/5
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Productos buscar(@PathParam("id") int id) {
		System.out.println("TRAZA DE LA CAPA DE SERVICIO<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		dao = new ProductoDAO();
		return (Productos) dao.buscar(id);
	}

	@Path("eliminar-id/{id}") // http://localhost:8090/JDBCWeb_CJHM/JDBCWeb_CJHM/productos/eliminar-id/5
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Status eliminar(@PathParam("id") int id) {
		Status status = new Status();
		dao = new ProductoDAO();

		respuesta = dao.eliminar(id);

		if (respuesta.equals("1")) {
			status.setMensaje("Eliminado correctamente");
			status.setRespuesta(respuesta);
		} else {
			status.setMensaje("No se pudo eliminar");
			status.setRespuesta(respuesta);
		}

		return status;
	}

	
	
	
	
}
