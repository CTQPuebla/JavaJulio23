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
@Table(name="EMPLEADOS")
public class Empleados implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Aqui ya no es necesario los controladores
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name="cid_auto", sequenceName="EMPLEADOS_SEQ", allocationSize=1)
	@Column(name="EMPLEADO_ID", columnDefinition="NUMBER")
	private int empleadoId;
	
	@Column(name="NOMBRE", columnDefinition = "NVARCHAR2(15)")
	private String nombre;
	@Column(name="FECHA_INGRESO", columnDefinition = "DATE")
	private Date fechaIngreso;
	@Column(name="SALARIO", columnDefinition = "NUMBER(5,2)")
	private double salario;
	
	@OneToMany(mappedBy="empleado")
	private List<Ventas> line;
	
	
	
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
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
