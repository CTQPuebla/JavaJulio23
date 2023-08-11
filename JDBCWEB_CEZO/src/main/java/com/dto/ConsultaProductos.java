package com.dto;

public class ConsultaProductos {
	
	public String nombreProd;
	public String refrigerado;
	public String nombreDepto;
	public String nombreEmp;
	
	public ConsultaProductos(String nombreProd, String refrigerado, String nombreDepto, String nombreEmp) {

		this.nombreProd = nombreProd;
		this.refrigerado = refrigerado;
		this.nombreDepto = nombreDepto;
		this.nombreEmp = nombreEmp;
	}
	public String getNombreProd() {
		return nombreProd;
	}
	public void setNombreProd(String nombreProd) {
		this.nombreProd = nombreProd;
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
	public String getNombreEmp() {
		return nombreEmp;
	}
	public void setNombreEmp(String nombreEmp) {
		this.nombreEmp = nombreEmp;
	}
	@Override
	public String toString() {
		return "consultaProductos [nombreProd=" + nombreProd + ", refrigerado=" + refrigerado + ", nombreDepto="
				+ nombreDepto + ", nombreEmp=" + nombreEmp + "]";
	}
	
	
	
}
