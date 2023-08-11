package com.persistence.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMERS")
public class Clientes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name="cid_auto", sequenceName="CUSTOMERS_SEQ", allocationSize=1)
	@Column(name="CLIENTE_ID", columnDefinition="NUMBER")
	private int clienteId;
	
	@Column(name="NOMBRE", columnDefinition = "NVARCHAR(15)")
	private String nombre;
	@Column(name="FECHA_NAC", columnDefinition = "DATE")
	private Date fechaNac;
	@Column(name="DOMICILIO", columnDefinition = "NVARCHAR2(40)")
	private String domicilio;
	
	@OneToMany(mappedBy="cliente")
	private List<Ventas> line;
	
	
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
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
