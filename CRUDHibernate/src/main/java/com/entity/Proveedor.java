package com.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table (name="PROVEEDOR")
public class Proveedor {
	public Proveedor() {}
	public Proveedor(int id) {
		this.proveedorId = id;
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name="cid_auto", sequenceName="PROVEEDOR_SEQ")

	@Column(name="PROVEEDOR_ID", columnDefinition="NUMBER")
	int proveedorId;
	
	@Column(name="NOMBRE", columnDefinition="NVARCHAR2(30)")
	String nombre;
	@Column(name="TELEFONO", columnDefinition="NVARCHAR2(10)")
	String telefono;
	@Column(name="CORREO", columnDefinition="NVARCHAR2(20)")
	String correo;
	
	
	@OneToMany (mappedBy = "proveedorId")
	private List<Prod_prov> lines;
	


	public int getProveedorId() {
		return proveedorId;
	}
	public void setProveedorId(int proveedorId) {
		this.proveedorId = proveedorId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public List<Prod_prov> getLines() {
		return lines;
	}
	public void setLines(List<Prod_prov> lines) {
		this.lines = lines;
	}

	
	
	

}
