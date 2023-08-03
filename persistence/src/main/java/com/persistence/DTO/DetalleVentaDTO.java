package com.persistence.DTO;

public class DetalleVentaDTO {

  private int productoID;
  private int cantida;
        
   public DetalleVentaDTO() {}

public DetalleVentaDTO(int productoID, int cantida) {
	super();
	this.productoID = productoID;
	this.cantida = cantida;
}

public int getProductoID() {
	return productoID;
}

public void setProductoID(int productoID) {
	this.productoID = productoID;
}

public int getCantida() {
	return cantida;
}

public void setCantida(int cantida) {
	this.cantida = cantida;
}

@Override
public String toString() {
	return "DetalleVentaDTO [productoID=" + productoID + ", cantida=" + cantida + "]";
}
   
   
}
