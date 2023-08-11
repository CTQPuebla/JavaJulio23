package com.msproductos.request;

import java.sql.Date;

import javax.validation.constraints.*;

public class ProductoRequest {

	private int productoId;
	private int deptoId;
	@NotBlank(message = "No debe quedar en blanco")
	private String nombre;
	@FutureOrPresent(message = "La fecha debe ser mayor o igual que la actual")
	private Date fechacaducidad;
	// Validar que no sea cero, sea menor a 900
	@Min(value = 1, message = "Elvalor minimo es 1")
	@Max(value = 899, message = "El valor debe ser menor a 900")
	private double preciocompra;
	
	@Min(value = 1, message = "El valor minimo es 1")
	@Max(value = 1499, message = "El valor debe ser menor a 1500")
	private double precioventa;
	
	//@Pattern(regexp="(Y,N)", message="El valor ingresado debe ser Y o N")
	private String refrigerado;

	public ProductoRequest() {
	}

	public ProductoRequest(int productoId, int deptoId, String nombre, Date fechacaducidad, double preciocompra,
			double precioventa, String refrigerado) {

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

	public double getPreciocompra() {
		return preciocompra;
	}

	public void setPreciocompra(double preciocompra) {
		this.preciocompra = preciocompra;
	}

	public double getPrecioventa() {
		return precioventa;
	}

	public void setPrecioventa(double precioventa) {
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
		return "ProductoRequest [productoId=" + productoId + ", deptoId=" + deptoId + ", nombre=" + nombre
				+ ", fechacaducidad=" + fechacaducidad + ", preciocompra=" + preciocompra + ", precioventa="
				+ precioventa + ", refrigerado=" + refrigerado + "]";
	}

}
