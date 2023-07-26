package com.entity;

import java.sql.Date;

public class Productos {

	
	private int productoId;
	private int deptoId;
	private String nombre;
	private Date fechacaducidad;
	private int preciocompra;
	private int precioventa;
	private String refrigerado;
	
	public Productos() {}

	public Productos(int productoId, int deptoId, String nombre, Date fechacaducidad, int preciocompra, int precioventa,
			String refrigerado) {
		this.productoId = productoId;
		this.deptoId = deptoId;
		this.nombre = nombre;
		this.fechacaducidad = fechacaducidad;
		this.preciocompra = preciocompra;
		this.precioventa = precioventa;
		this.refrigerado = refrigerado;
	}

	public int getProductoId() {
		return productoId;
	}

	public void setProductoId(int productoId) {
		this.productoId = productoId;
	}

	public int getDeptoId() {
		return deptoId;
	}

	public void setDeptoId(int deptoId) {
		this.deptoId = deptoId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechacaducidad() {
		return fechacaducidad;
	}

	public void setFechacaducidad(Date fechacaducidad) {
		this.fechacaducidad = fechacaducidad;
	}

	public int getPreciocompra() {
		return preciocompra;
	}

	public void setPreciocompra(int preciocompra) {
		this.preciocompra = preciocompra;
	}

	public int getPrecioventa() {
		return precioventa;
	}

	public void setPrecioventa(int precioventa) {
		this.precioventa = precioventa;
	}

	public String getRefrigerado() {
		return refrigerado;
	}

	public void setRefrigerado(String refrigerado) {
		this.refrigerado = refrigerado;
	}

	@Override
	public String toString() {
		return "Productos [productoId=" + productoId + ", deptoId=" + deptoId + ", nombre=" + nombre
				+ ", fechacaducidad=" + fechacaducidad + ", preciocompra=" + preciocompra + ", precioventa="
				+ precioventa + ", refrigerado=" + refrigerado + "]";
	}
	
	
	
	
}
