package com.dto;

public class DetalleProd {

	private String nombre;
	private String refrigerado;
	private String nombreDepartamento;
	private String nombreEmpleado;
	
	
	public DetalleProd(String nombre, String refrigerado, String nombreDepartamento, String nombreEmpleado) {
		super();
		this.nombre = nombre;
		this.refrigerado = refrigerado;
		this.nombreDepartamento = nombreDepartamento;
		this.nombreEmpleado = nombreEmpleado;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getRefrigerado() {
		return refrigerado;
	}


	public void setRefrigerado(String refrigerado) {
		this.refrigerado = refrigerado;
	}


	public String getNombreDepartamento() {
		return nombreDepartamento;
	}


	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}


	public String getNombreEmpleado() {
		return nombreEmpleado;
	}


	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}


	@Override
	public String toString() {
		return "DetalleProd [nombre=" + nombre + ", refrigerado=" + refrigerado + ", nombreDepartamento="
				+ nombreDepartamento + ", nombreEmpleado=" + nombreEmpleado + "]";
	}
	
	
	
}
