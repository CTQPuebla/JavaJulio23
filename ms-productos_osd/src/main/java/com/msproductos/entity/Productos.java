package com.msproductos.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="PRODUCTOS")
public class Productos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Aqui ya no es necesario los controladores
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name="cid_auto", sequenceName="PRODUCTOS_SEQ", allocationSize=1)
	@Column(name="PRODUCTO_ID", columnDefinition="NUMBER")
	private int productoId;
	
	@Column(name="DEPTO_ID", columnDefinition = "NUMBER")
	private int deptoId;
	@Column(name="NOMBRE", columnDefinition = "NVARCHAR(20)")
	private String nombre;
	@Column(name="FECHA_CAD", columnDefinition = "DATE")
	private Date fechaCad;
	@Column(name="PRECIO_COMPRA", columnDefinition = "NUMBER(5,2)")
	private double precioCompra;
	@Column(name="PRECIO_VENTA", columnDefinition = "NUMBER(5,2)")
	private double precioVenta;
	@Column(name="REFRIGERADO", columnDefinition = "CHAR")
	private String refrigerado;
	
	
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
