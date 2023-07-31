package com.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table( name = "PRODUCTOS")
public class Productos {
	
	public Productos() {}
	public Productos(int id) {
		this.productoId= id;
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cid_auto")
	@SequenceGenerator(name = "cid_auto", sequenceName = "PRODUCTOS_SEQ")
	@Column( name = "PRODUCTO_ID", columnDefinition = "NUMERO")
	int productoId;
	
	@Column(name = "DEPTO_ID", columnDefinition = "NUMERO")
	int depto_id;
	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2()15")
	String nombre;
	@Column(name = "FECHA_CAD", columnDefinition = "NVARCHAR2()15")
	String fecha_cad;
	@Column(name = "PRECIO_COMPRA", columnDefinition = "NUMERO")
	int precio_compra;
	@Column(name = "PRECIO_VENTA", columnDefinition = "NUMERO")
	int precio_venta;
	@Column(name = "REFRIGERADO", columnDefinition = "NVARCHAR2()15")
	String refrigerado;
	public Productos(int productoId, int depto_id, String nombre, String fecha_cad, int precio_compra, int precio_venta,
			String refrigerado) {
		super();
		this.productoId = productoId;
		this.depto_id = depto_id;
		this.nombre = nombre;
		this.fecha_cad = fecha_cad;
		this.precio_compra = precio_compra;
		this.precio_venta = precio_venta;
		this.refrigerado = refrigerado;
	}
	public int getProductoId() {
		return productoId;
	}
	public void setProductoId(int productoId) {
		this.productoId = productoId;
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
	public String getFecha_cad() {
		return fecha_cad;
	}
	public void setFecha_cad(String fecha_cad) {
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
		return "Productos [productoId=" + productoId + ", depto_id=" + depto_id + ", nombre=" + nombre + ", fecha_cad="
				+ fecha_cad + ", precio_compra=" + precio_compra + ", precio_venta=" + precio_venta + ", refrigerado="
				+ refrigerado + "]";
	}
	
}