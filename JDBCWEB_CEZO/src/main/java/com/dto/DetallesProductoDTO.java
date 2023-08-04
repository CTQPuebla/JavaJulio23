package com.dto;

public class DetallesProductoDTO {

	private String nombre;
	private double precioVenta;
	private int stock;
	private String nombreProovedor;
	
	
	
	public DetallesProductoDTO(String nombre, double precioVenta, int stock, String nombreProovedor) {
		
		this.nombre = nombre;
		this.precioVenta = precioVenta;
		this.stock = stock;
		this.nombreProovedor = nombreProovedor;
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



	public String getNombreProovedor() {
		return nombreProovedor;
	}



	public void setNombreProovedor(String nombreProovedor) {
		this.nombreProovedor = nombreProovedor;
	}



	@Override
	public String toString() {
		return "DetallesProductoDTO [nombre=" + nombre + ", precioVenta=" + precioVenta + ", stock=" + stock
				+ ", nombreProovedor=" + nombreProovedor + "]";
	}
	

	
	
}
