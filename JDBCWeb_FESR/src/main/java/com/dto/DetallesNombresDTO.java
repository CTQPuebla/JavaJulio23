package com.dto;

public class DetallesNombresDTO {
	private String nombreEmpleado;
	private String nombreDepto;
	private String nombreProductos;
	private String refrigerado;
	public DetallesNombresDTO(String nombreProductos, String refrigerado,String nombreEmpleado , String nombreDepto ) {
		super();
		this.nombreEmpleado = nombreEmpleado;
		this.nombreDepto = nombreDepto;
		this.nombreProductos = nombreProductos;
		this.refrigerado = refrigerado;
	}
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}
	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}
	public String getNombreDepto() {
		return nombreDepto;
	}
	public void setNombreDepto(String nombreDepto) {
		this.nombreDepto = nombreDepto;
	}
	public String getNombreProductos() {
		return nombreProductos;
	}
	public void setNombreProductos(String nombreProductos) {
		this.nombreProductos = nombreProductos;
	}
	public String getRefrigerado() {
		return refrigerado;
	}
	public void setRefrigerado(String refrigerado) {
		this.refrigerado = refrigerado;
	}
	@Override
	public String toString() {
		return "DetallesNombresDTO [nombreEmpleado=" + nombreEmpleado + ", nombreDepto=" + nombreDepto
				+ ", nombreProductos=" + nombreProductos + ", refrigerado=" + refrigerado + "]";
	}

}
