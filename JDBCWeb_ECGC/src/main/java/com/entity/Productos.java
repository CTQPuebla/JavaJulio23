package com.entity;

import java.sql.Date;

public class Productos {
	
	private int producto_id;
	private int depto_id;
	private String nombre;
	private Date fecha_cad;
	private int precio_compra;
	private int precio_venta;
	private String refrigerado;
	public Productos(){}
	public Productos(int producto_id, int depto_id, String nombre, Date fecha_cad, int precio_compra, int precio_venta,
			String refrigerado) {
		
		this.producto_id = producto_id;
		this.depto_id = depto_id;
		this.nombre = nombre;
		this.fecha_cad = fecha_cad;
		this.precio_compra = precio_compra;
		this.precio_venta = precio_venta;
		this.refrigerado = refrigerado;
	}
	public int getProducto_id() {
		return producto_id;
	}
	public void setProducto_id(int producto_id) {
		this.producto_id = producto_id;
	}
	public int getDepto_id() {
		return depto_id;
	}
	public void setDepto_id(int depto_id) {
		this.depto_id = depto_id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFecha_cad() {
		return fecha_cad;
	}
	public void setFecha_cad(Date fecha_cad) {
		this.fecha_cad = fecha_cad;
	}
	public int getPrecio_compra() {
		return precio_compra;
	}
	public void setPrecio_compra(int precio_compra) {
		this.precio_compra = precio_compra;
	}
	public int getPrecio_venta() {
		return precio_venta;
	}
	public void setPrecio_venta(int precio_venta) {
		this.precio_venta = precio_venta;
	}
	public String getRefrigerado() {
		return refrigerado;
	}
	public void setRefrigerado(String refrigerado) {
		this.refrigerado = refrigerado;
	}
	@Override
	public String toString() {
		return "Productos [producto_id=" + producto_id + ", depto_id=" + depto_id + ", nombre=" + nombre
				+ ", fecha_cad=" + fecha_cad + ", precio_compra=" + precio_compra + ", precio_venta=" + precio_venta
				+ ", refrigerado=" + refrigerado + "]";
	}
}
	