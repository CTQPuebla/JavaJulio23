package com.entity;

import java.sql.Date;

public class Productos {

	
	private int productoId;
	private int dptoId;
	private String nombre;
	private Date fechaCad;
	private int precioCompra;
	private int precioVenta;
	private String refigerado;
	
	public Productos() {}

	public Productos(int productoId, int dptoId, String nombre, Date fechaCad, int precioCompra, int precioVenta,
			String refigerado) {
		
		this.productoId = productoId;
		this.dptoId = dptoId;
		this.nombre = nombre;
		this.fechaCad = fechaCad;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.refigerado = refigerado;
	}

	public int getProductoId() {
		return productoId;
	}

	public void setProductoId(int productoId) {
		this.productoId = productoId;
	}

	public int getDptoId() {
		return dptoId;
	}

	public void setDptoId(int dptoId) {
		this.dptoId = dptoId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaCad() {
		return fechaCad;
	}

	public void setFechaCad(Date fechaCad) {
		this.fechaCad = fechaCad;
	}

	public int getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(int precioCompra) {
		this.precioCompra = precioCompra;
	}

	public int getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(int precioVenta) {
		this.precioVenta = precioVenta;
	}

	public String getRefigerado() {
		return refigerado;
	}

	public void setRefigerado(String refigerado) {
		this.refigerado = refigerado;
	}

	@Override
	public String toString() {
		return "Productos [productoId=" + productoId + ", dptoId=" + dptoId + ", nombre=" + nombre + ", fechaCad="
				+ fechaCad + ", precioCompra=" + precioCompra + ", precioVenta=" + precioVenta + ", refigerado="
				+ refigerado + "]";
	}


	
}
