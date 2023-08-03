package com.Persistence.request;

import javax.persistence.Column;

public class DetVentaRequest {
	
     private int detventaId;
	 private int ventaId;
	 private int productoId;
	 private int cantidad;
	 
	 public  DetVentaRequest() {}

	public DetVentaRequest(int detventaId, int ventaId, int productoId, int cantidad) {
		
		this.detventaId = detventaId;
		this.ventaId = ventaId;
		this.productoId = productoId;
		this.cantidad = cantidad;
	}

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

	@Override
	public String toString() {
		return "DetVentaRequest [detventaId=" + detventaId + ", ventaId=" + ventaId + ", productoId=" + productoId
				+ ", cantidad=" + cantidad + "]";
	} 
	 
	 

}
