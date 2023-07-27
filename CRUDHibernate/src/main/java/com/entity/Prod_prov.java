package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "prodprovId")
@Entity
@Table (name="PROD_PROV")
public class Prod_prov {
	public Prod_prov() {}
	public Prod_prov(int id) {
		this.prodprovId = id;
	}
		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
		@SequenceGenerator(name="cid_auto", sequenceName="PROD_PROV_SEQ")
		
		@Column(name="PROD_PROV_ID", columnDefinition="NUMBER")
		int prodprovId;
		
		@ManyToOne
		@JoinColumn(name="PROVEEDOR_ID", columnDefinition="NUMBER")
	    Proveedor proveedorId;
		
		@OneToOne
		@JoinColumn(name="PRODUCTO_ID", columnDefinition="NUMBER")
		Productos producto;
		
		
		

		public int getProdprovId() {
			return prodprovId;
		}
		public void setProdprovId(int prodprovId) {
			this.prodprovId = prodprovId;
		}
		
		public Productos getProducto() {
			return producto;
		}
		public void setProducto(Productos producto) {
			this.producto = producto;
		}
		public Proveedor getProveedorId() {
			return proveedorId;
		}
		public void setProveedorId(Proveedor proveedorId) {
			this.proveedorId = proveedorId;
		}
		
		
	
	}

