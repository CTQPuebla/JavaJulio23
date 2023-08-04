package com.persistence.request;

import java.sql.Date;
import java.util.List;

import com.persistence.DTO.DetalleVentaDTO;
import com.persistence.entity.Clientes;
import com.persistence.entity.Empleados;

public class VentaRequest {

	 private int ventaId;
	 private Empleados empleado;
	 private Clientes cliente;
	 private Date fechaventa;
	 private int subtotal;
	 private int total;
	 
	 private List <DetalleVentaDTO> producto;
	 
	 public VentaRequest() {}

	public VentaRequest(int ventaId, Empleados empleado, Clientes cliente, Date fechaventa, int subtotal, int total,
			List<DetalleVentaDTO> producto) {
		super();
		this.ventaId = ventaId;
		this.empleado = empleado;
		this.cliente = cliente;
		this.fechaventa = fechaventa;
		this.subtotal = subtotal;
		this.total = total;
		this.producto = producto;
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

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	public Date getFechaventa() {
		return fechaventa;
	}

	public void setFechaventa(Date fechaventa) {
		this.fechaventa = fechaventa;
	}

	public int getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(int subtotal) {
		this.subtotal = subtotal;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<DetalleVentaDTO> getProducto() {
		return producto;
	}

	public void setProducto(List<DetalleVentaDTO> producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "VentaRequest [ventaId=" + ventaId + ", empleado=" + empleado + ", cliente=" + cliente + ", fechaventa="
				+ fechaventa + ", subtotal=" + subtotal + ", total=" + total + ", producto=" + producto + "]";
	}


	
	 
	
}
