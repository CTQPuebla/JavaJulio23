package com.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;




@Entity
@Table(name="productos")
public class Productos {
	
	

	public Productos() {}
	
	public Productos(int id) {
		this.productoId = id;
	}
	 @Id
	 @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	 @SequenceGenerator(name="cid_auto",sequenceName="PRODUCTOS_SEQ")
	 @Column(name="PRODUCTO_ID",columnDefinition="NUMBER")
	 int productoId;
	 
	 @Column(name="DEPTO_ID",columnDefinition="NUMBER")
	 int deptoId;;
	 
	 @Column(name="NOMBRE",columnDefinition="NVARCHAR2(20)")
	  String nombre;
	 
	 @Column(name="FECHA_CAD",columnDefinition="DATE")
	  Date fechacaducidad;
	 
	 @Column(name="PRECIO_COMPRA",columnDefinition="NUMBER")
	 double preciocompra;
	 
	 @Column(name="PRECIO_VENTA",columnDefinition="NUMBER")
	 double precioventa;
	 
	 @Column(name="REFRIGERADO",columnDefinition="CHAR")
	 String refrigerado;
	 
	// @OneToOne(mappedBy = "producto") 
	//  private Inventario inventario;
	 
	 @OneToOne(mappedBy = "producto")
	 private Prod_prov prodprov;

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

	public Prod_prov getProdprov() {
		return prodprov;
	}

	public void setProdprov(Prod_prov prodprov) {
		this.prodprov = prodprov;
	}
	 

	 
	 
	 
	


	
	 
	 
	 

}
