package com.Persistence.request;

import java.sql.Date;

import javax.persistence.Column;

public class ClienteRequest {
	
	private int clienteId;
    private String nombre;
	private Date fechanacimiento;
	private String domicilio;
	
	
	public ClienteRequest() {}


	public ClienteRequest(int clienteId, String nombre, Date fechanacimiento, String domicilio) {
		super();
		this.clienteId = clienteId;
		this.nombre = nombre;
		this.fechanacimiento = fechanacimiento;
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


	public Date getFechanacimiento() {
		return fechanacimiento;
	}


	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}


	public String getDomicilio() {
		return domicilio;
	}


	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}


	@Override
	public String toString() {
		return "ClienteRequest [clienteId=" + clienteId + ", nombre=" + nombre + ", fechanacimiento=" + fechanacimiento
				+ ", domicilio=" + domicilio + "]";
	}
	
	




	
	
	

}
