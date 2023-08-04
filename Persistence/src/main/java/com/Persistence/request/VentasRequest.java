package com.Persistence.request;

import java.sql.Date;
import java.util.List;

import com.Persistence.DTO.DetalleVentaDTO;
import com.Persistence.entity.Cliente;
import com.Persistence.entity.Empleados;



public class VentasRequest {
	
	
	 private int ventaId;
	 private Empleados empleado;
	 private Cliente cliente;
	 private Date fechaventa;
	 private double subtotal;
	 private double total;
	 private List <DetalleVentaDTO>productos;
	 
	 public VentasRequest() {}

	

	public VentasRequest(int ventaId, Empleados empleado, Cliente cliente, Date fechaventa, double subtotal,
			double total, List<DetalleVentaDTO> productos) {
		
		this.ventaId = ventaId;
		this.empleado = empleado;
		this.cliente = cliente;
		this.fechaventa = fechaventa;
		this.subtotal = subtotal;
		this.total = total;
		this.productos = productos;
	}



	public List<DetalleVentaDTO> getProductos() {
		return productos;
	}



	public void setProductos(List<DetalleVentaDTO> productos) {
		this.productos = productos;
	}



	public int getVentaId() {
		return ventaId;
	}

	public void setVentaId(int ventaId) {
		this.ventaId = ventaId;
	}

	public Empleados getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleados empleado) {
		this.empleado = empleado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getFechaventa() {
		return fechaventa;
	}

	public void setFechaventa(Date fechaventa) {
		this.fechaventa = fechaventa;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "VentasRequest [ventaId=" + ventaId + ", empleado=" + empleado + ", cliente=" + cliente + ", fechaventa="
				+ fechaventa + ", subtotal=" + subtotal + ", total=" + total + "]";
	}

	
	 
	 
	 

}
