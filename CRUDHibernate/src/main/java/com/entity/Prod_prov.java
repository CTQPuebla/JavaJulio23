package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "prod_provId")
@Entity
@Table(name="PROD_PROV")

public class Prod_prov {
	
	public Prod_prov() {}
	public Prod_prov(int id) {
		this.prod_provId=id;
	}
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	 @SequenceGenerator(name="cid_auto",sequenceName="PROD_PROV_SEQ")
	 @Column(name="PROD_PROV_ID",columnDefinition="NUMBER")
	 int prod_provId;
	 
	 @ManyToOne
	 @JoinColumn(name="PROVEEDOR_ID",columnDefinition="NUMBER")
	 Proveedor proveedor;
	
	 
	 @OneToOne
	 @JoinColumn(name="PRODUCTO_ID",columnDefinition="NUMBER")
	 Productos producto;


	public int getProd_provId() {
		return prod_provId;
	}
	public void setProd_provId(int prod_provId) {
		this.prod_provId = prod_provId;
	}
	public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	public Productos getProducto() {
		return producto;
	}
	public void setProducto(Productos producto) {
		this.producto = producto;
	}


	
	

}
