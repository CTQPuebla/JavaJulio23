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
public class Clientes implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	 @SequenceGenerator(name="cid_auto",sequenceName="CUSTOMERS_SEQ", allocationSize=1)
	 @Column(name="CLIENTE_ID",columnDefinition="NUMBER")
	 private int clienteId;
	 
	 @Column(name="NOMBRE",columnDefinition="NVARCHAR2(20)")
	 private String nombre;
	 
	 @Column(name="FECHA_NAC",columnDefinition="DATE")
	 private Date fechanac;
	 
	 @Column(name="DOMICILIO",columnDefinition="NVARCHAR2(20)")
	 private String domicilio;

	 @OneToMany(mappedBy="cliente")
	 private List<Ventas>lines;
	 
	 
	 
	 
	 
	 
	public List<Ventas> getLines() {
		return lines;
	}

	public void setLines(List<Ventas> lines) {
		this.lines = lines;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Clientes [clienteId=" + clienteId + ", nombre=" + nombre + ", fechanac=" + fechanac + ", domicilio="
				+ domicilio + "]";
	}
	 
	 

}
