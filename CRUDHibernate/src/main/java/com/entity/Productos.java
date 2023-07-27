package com.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;


@Entity
@Table (name="PRODUCTOS")
public class Productos {
	
	public Productos() {}
	public Productos(int id) {
		this.productoId = id;
		
	}
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name="cid_auto", sequenceName="PRODUCTOS_SEQ")
	@Column(name="PRODUCTO_ID", columnDefinition="NUMBER")
	int productoId;
	
	@Column(name="DEPTO_ID", columnDefinition="NUMBER")
	int deptoid;
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(20)")
	String nombre;
	@Column(name="FECHA_CAD", columnDefinition="DATE")
	Date fechacad;
	@Column(name="PRECIO_COMPRA", columnDefinition="NUMBER(5,2)")
	double preciocompra;
	@Column(name="PRECIO_VENTA", columnDefinition="NUMBER(5,2)")
	double precioventa;
	@Column(name="REFRIGERADO", columnDefinition="CHAR(1)")
	String refrigerado;

	@OneToOne (mappedBy = "producto")
	private Inventario inventario;
	
	@OneToOne (mappedBy = "producto")
	private Prod_prov prodprov;
	
	
	
	

	
	public Prod_prov getProdprov() {
		return prodprov;
	}
	public void setProdprov(Prod_prov prodprov) {
		this.prodprov = prodprov;
	}
	public Inventario getInventario() {
		return inventario;
	}
	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}
	public int getProductoId() {
		return productoId;
	}
	public void setProductoId(int productoId) {
		this.productoId = productoId;
	}
	public int getDeptoid() {
		return deptoid;
	}
	public void setDeptoid(int deptoid) {
		this.deptoid = deptoid;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechacad() {
		return fechacad;
	}
	public void setFechacad(Date fechacad) {
		this.fechacad = fechacad;
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
		return "Productos [productoId=" + productoId + ", deptoid=" + deptoid + ", nombre=" + nombre + ", fechacad="
				+ fechacad + ", preciocompra=" + preciocompra + ", precioventa=" + precioventa + ", refrigerado="
				+ refrigerado + "]";
	}
	
	//getters & setters
}