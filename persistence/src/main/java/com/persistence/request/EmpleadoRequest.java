package com.persistence.request;

import java.sql.Date;

public class EmpleadoRequest {
	
	
	 private int empleadoId;
	 private String nombre;
	 private Date fechaingreso;
	 private int salario;
	 
	 
	 public EmpleadoRequest() {}


	public EmpleadoRequest(int empleadoId, String nombre, Date fechaingreso, int salario) {
		
		this.empleadoId = empleadoId;
		this.nombre = nombre;
		this.fechaingreso = fechaingreso;
		this.salario = salario;
	}


	public int getEmpleadoId() {
		return empleadoId;
	}


	public void setEmpleadoId(int empleadoId) {
		this.empleadoId = empleadoId;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Date getFechaingreso() {
		return fechaingreso;
	}


	public void setFechaingreso(Date fechaingreso) {
		this.fechaingreso = fechaingreso;
	}


	public int getSalario() {
		return salario;
	}


	public void setSalario(int salario) {
		this.salario = salario;
	}


	@Override
	public String toString() {
		return "EmpleadoRequest [empleadoId=" + empleadoId + ", nombre=" + nombre + ", fechaingreso=" + fechaingreso
				+ ", salario=" + salario + "]";
	}
	 
	 
	 


}
