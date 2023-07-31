package com.dto;

public class DetellesEmpleadoDTO {

	private String nombre;
	 private String refrigerado;
	 private String nombreDepto;
	 private String nombreEmpleado;
	public DetellesEmpleadoDTO(String nombre, String refrigerado, String nombreDepto, String nombreEmpleado) {
		
		this.nombre = nombre;
		this.refrigerado = refrigerado;
		this.nombreDepto = nombreDepto;
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
	public String getNombreDepto() {
		return nombreDepto;
	}
	public void setNombreDepto(String nombreDepto) {
		this.nombreDepto = nombreDepto;
	}
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}
	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}
	@Override
	public String toString() {
		return "DetellesEmpleadoDTO [nombre=" + nombre + ", refrigerado=" + refrigerado + ", nombreDepto=" + nombreDepto
				+ ", nombreEmpleado=" + nombreEmpleado + "]";
	}


}

