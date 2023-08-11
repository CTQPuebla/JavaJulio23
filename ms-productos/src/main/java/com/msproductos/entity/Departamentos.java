package com.msproductos.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="DEPARTAMENTO")
public class Departamentos implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//Aqui ya no es necesario los constructores
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	 @SequenceGenerator(name="cid_auto",sequenceName="DEPARTAMENTOS_SEQ", allocationSize=1)
	 @Column(name="DEPTO_ID",columnDefinition="NUMBER")
	 private int departamentoId;
	 
	 @Column(name="EMPLEADO_ID",columnDefinition="NUMBER")
	 private int empleadoId;;
	 
	 @Column(name="NOMBRE",columnDefinition="NVARCHAR2(20)")
	 private String nombre;

	public int getDepartamentoId() {
		return departamentoId;
	}

	public void setDepartamentoId(int departamentoId) {
		this.departamentoId = departamentoId;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Departamentos [departamentoId=" + departamentoId + ", empleadoId=" + empleadoId + ", nombre=" + nombre
				+ "]";
	}
	 
	 
	 
	 
}
