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
import com.dto.DetallesNombresDTO;
import com.dto.DetallesProductoDTO;
import com.entity.Autos;
import com.entity.Productos;
import com.general.Status;

@Path ("productos")
public class ProductosService {
	
	Productos producto = null;
	ProductoDAO dao = null;
	String respuesta = "";

	@Path("mostrar")  //http://localhost:8090/JDBCWeb_FESR/JDBCWeb_FESR/autos/mostrar
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	
	public List<Productos>mostrar(){
		dao = new ProductoDAO();
		return dao.mostrar();
		
	}
	@Path("guardar")  //    http://localhost:8090/JDBCWeb_FESR/JDBCWeb_FESR/autos/guardar
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Status guardar (Productos producto) {
		Status status = new Status();
		status.setOb(producto);
		
		dao = new ProductoDAO();
		respuesta = dao.guardar(producto);
		
		if (respuesta.equals("1")) {
			status.setMensaje("Guardado exitoso");
			status.setRespuesta(respuesta);
			
		}else {
			status.setMensaje("No fue posible cargar");
			status.setRespuesta(respuesta);
		}
		
		
		
		
		return status;
	}
	@Path("editar")  //http:/localhost:8090/?/?/autos/mostrar
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	
	public Status editar (Productos producto) {
		Status status = new Status();
		status.setOb(producto);
		
		dao = new ProductoDAO();
		respuesta = dao.actualizar(producto);
		
		if (respuesta.equals("1")) {
			status.setMensaje("Actualizado exitoso");
			status.setRespuesta(respuesta);
			
		}else {
			status.setMensaje("No fue posible Actualizar");
			status.setRespuesta(respuesta);
		}
		return status;
	}
	
	@Path("buscar-por-id/{id}")  //http://localhost:8090/?/?/autos/mostrar
	@POST
	@Produces({MediaType.APPLICATION_JSON})
	public Productos buscar(@PathParam("id")int id) {
		dao = new ProductoDAO();
		return dao.buscar(id);
	}
	@Path("eliminar/{id}")  //http:/localhost:8090/?/?/autos/mostrar
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Status eliminar(@PathParam("id")int id) {
		Status status =new Status();
		dao = new ProductoDAO();
		
		respuesta =dao.eliminar(id);
		if (respuesta.equals("1")) {
			status.setMensaje("Eliminado Ok");
			status.setRespuesta(respuesta);
			
		}else {
			status.setMensaje("error");
			status.setRespuesta(respuesta);
		}
		
		return status;
	}
	@Path("detalles-productos")  //http://localhost:8090/JDBCWeb_FESR/JDBCWeb_FESR/autos/detalles-productos
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	
	public List<DetallesProductoDTO>detallesproductos(){
		dao = new ProductoDAO();
		return dao.detallesProductos();
		
	}
	
	@Path("detalles-productos-nombres")  //http://localhost:8090/JDBCWeb_FESR/JDBCWeb_FESR/autos/detalles-productos-nombres
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	
	public List<DetallesNombresDTO>detallesnombres(){
		dao = new ProductoDAO();
		return dao.detallesnombres();
		
	}

}

