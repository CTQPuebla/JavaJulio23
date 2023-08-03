package com.persistence.request;

import java.sql.Date;

import javax.persistence.Column;

public class ClienteRequest {

	private int clienteId;
	private String nombre;
	private Date fechanac;
	private String domicilio;
	
	public ClienteRequest() {}

	public ClienteRequest(int clienteId, String nombre, Date fechanac, String domicilio) {
		this.clienteId = clienteId;
		this.nombre = nombre;
		this.fechanac = fechanac;
		this.domicilio = domicilio;
	}

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechanac() {
		return fechanac;
	}

	public void setFechanac(Date fechanac) {
		this.fechanac = fechanac;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	@Override
	public String toString() {
		return "ClienteRequest [clienteId=" + clienteId + ", nombre=" + nombre + ", fechanac=" + fechanac
				+ ", domicilio=" + domicilio + "]";
	}
	
	
	
	
}
