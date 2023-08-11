//package com.entity;
//
//import java.sql.Date;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//import javax.persistence.SequenceGenerator;
//import javax.persistence.Table;
//
//import com.fasterxml.jackson.annotation.JsonIdentityInfo;
//import com.fasterxml.jackson.annotation.ObjectIdGenerators;
//
//
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "inventarioId")
//@Entity
//@Table(name="inventario")
//public class Inventario {
//	
//	
//	
//	
//	public Inventario() {}
//	
//	
//	public Inventario(int id) {
//		this.inventarioId=id;
//	}
//	
//	 @Id
//	 @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
//	 @SequenceGenerator(name="cid_auto",sequenceName="INVENTARIO_SEQ")
//	 @Column(name="INVENTARIO_ID",columnDefinition="NUMBER")
//	 int inventarioId;
//	
//	 @OneToOne
//	 @JoinColumn(name="PRODUCTO_ID",columnDefinition="NUMBER")
//	 Productos producto;
//	 
//	 @Column(name="STOCK",columnDefinition="NUMBER")
//	 int stock;
//	 
//	 @Column(name="FECHA",columnDefinition="DATE")
//	 Date fecha;
//
//	public int getInventarioId() {
//		return inventarioId;
//	}
//
//
//	public void setInventarioId(int inventarioId) {
//		this.inventarioId = inventarioId;
//	}
//
//
//	public Productos getProducto() {
//		return producto;
//	}
//
//
//	public void setProducto(Productos producto) {
//		this.producto = producto;
//	}
//
//
//	public int getStock() {
//		return stock;
//	}
//
//
//	public void setStock(int stock) {
//		this.stock = stock;
//	}
//
//
//	public Date getFecha() {
//		return fecha;
//	}
//
//
//	public void setFecha(Date fecha) {
//		this.fecha = fecha;
//	}
//
//
//	@Override
//	public String toString() {
//		return "Inventario [inventarioId=" + inventarioId + ", producto=" + producto + ", stock=" + stock + ", fecha="
//				+ fecha + "]";
//	}
//
//
//	
//
//	 
//	 
//}
