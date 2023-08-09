package com.msproductos.request;

import java.sql.Date;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class ProductoRequest {

	private int productoId;
	
	
	private int deptoId;
	
	@NotBlank(message="No puede quedar en blanco")
	private String nombre;
	
	@FutureOrPresent(message="La fecha debe ser mayor o igual que la actual")
	private Date fechaCad;
	
	//Validar que no sea cero, sea menor a 900
	@NotNull
	@Min(value=1, message ="El valor minimo es 1")
	@Max(value=899, message ="El valor debe ser menor a 900")
	private double precioCompra;
	
	//Validar que no sea cero, sea menor a 1500
	@NotNull
	@Min(value=1, message ="El valor minimo es 1")
	@Max(value=899, message ="El valor debe ser menor a 1500")
	private double precioVenta;
	@NotBlank
	//@Pattern(regexp= "N"  "Y")
	private String refrigerado;
	
	
	
	public ProductoRequest() {}

	public ProductoRequest(int productoId, int deptoId, String nombre, Date fechaCad, double precioCompra,
			double precioVenta, String refrigerado) {
		this.productoId = productoId;
		this.deptoId = deptoId;
		this.nombre = nombre;
		this.fechaCad = fechaCad;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
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


	public Date getFechaCad() {
		return fechaCad;
	}

	public void setFechaCad(Date fechaCad) {
		this.fechaCad = fechaCad;
	}


	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}


	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
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
				+ ", fechaCad=" + fechaCad + ", precioCompra=" + precioCompra + ", precioVenta=" + precioVenta
				+ ", refrigerado=" + refrigerado + "]";
	}
	
	
	

}
