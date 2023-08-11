package com.persistence.DTO;

public class DetalleVentaDTO {
	
	int productoId;
	int cantidad;
	
	
	public DetalleVentaDTO() {}
	
	
	public DetalleVentaDTO(int productoId, int cantidad) {
		this.productoId = productoId;
		this.cantidad = cantidad;
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
		return "DetalleVentaDTO [productoId=" + productoId + ", cantidad=" + cantidad + "]";
	}
	
	
	

}
