package com.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="DET_VENTA")
public class Det_Venta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	 @SequenceGenerator(name="cid_auto",sequenceName="VENTAS_SEQ", allocationSize=1)
	 @Column(name="DET_VENTA_ID",columnDefinition="NUMBER")
	 private int detventaId;
	 
	 
	 @Column(name="VENTA_ID",columnDefinition="NUMBER")
	 private int ventaId;
	
	 
	 @Column(name="PRODUCTO_ID",columnDefinition="NUMBER")
	 private int productoId;
	 
	 @Column(name="CANTIDAD",columnDefinition="NUMBER")
	 private int cantidad;

	public int getDetventaId() {
		return detventaId;
	}

	public void setDetventaId(int detventaId) {
		this.detventaId = detventaId;
	}

	public int getVentaId() {
		return ventaId;
	}

	public void setVentaId(int ventaId) {
		this.ventaId = ventaId;
	}

	public int getProductoId() {
		return productoId;
	}

	public void setProductoId(int productoId) {
		this.productoId = productoId;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Det_Venta [detventaId=" + detventaId + ", ventaId=" + ventaId + ", productoId=" + productoId
				+ ", cantidad=" + cantidad + "]";
	}
	 
	 
	 

}
