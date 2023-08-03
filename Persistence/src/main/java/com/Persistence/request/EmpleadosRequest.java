package com.Persistence.request;

import java.sql.Date;

import javax.persistence.Column;

public class EmpleadosRequest {
	
	
	 private int empleadoId;
	 private String nombre;;
	 private Date fechaingreso;
	 private double salario;
	 
	 public EmpleadosRequest() {}

	public EmpleadosRequest(int empleadoId, String nombre, Date fechaingreso, double salario) {
		super();
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "EmpleadosRequest [empleadoId=" + empleadoId + ", nombre=" + nombre + ", fechaingreso=" + fechaingreso
				+ ", salario=" + salario + "]";
	}

	

	
	 
	 

}
