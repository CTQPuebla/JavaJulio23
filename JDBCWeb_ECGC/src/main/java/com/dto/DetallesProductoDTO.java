package com.dto;

public class DetallesProductoDTO {
	
	private String nombre;
	private double precioVenta;
	private int stock;
	private String nombreProbedor;
	
	public DetallesProductoDTO(String nombre,double precioVentas,int stock,String nombreProbedor) {
	this.nombre= nombre;
	this.precioVenta= precioVenta;
	this.stock= stock;
	this.nombreProbedor= nombreProbedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getNombreProbedor() {
		return nombreProbedor;
	}

	public void setNombreProbedor(String nombreProbedor) {
		this.nombreProbedor = nombreProbedor;
	}

	@Override
	public String toString() {
		return "DetallesProductoDTO [nombre=" + nombre + ", precioVenta=" + precioVenta + ", stock=" + stock
				+ ", nombreProbedor=" + nombreProbedor + "]";
	}
	

}
