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
public class Empleados  implements Serializable{

	
	private static final long serialVersionUID = 1L;

	
	 @Id
	 @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	 @SequenceGenerator(name="cid_auto",sequenceName="EMPLEADOS_SEQ", allocationSize=1)
	 @Column(name="EMPLEADO_ID",columnDefinition="NUMBER")
	 private int empleadoId;
	
	 @Column(name="NOMBRE",columnDefinition="NVARCHAR2(20)")
	 private String nombre;
	 
	 @Column(name="FECHA_INGRESO",columnDefinition="DATE")
	 private Date fechaingreso;
	 
	 @Column(name="SALARIO",columnDefinition="NUMBER")
	 private int salario;
	 
	 
	 @OneToMany(mappedBy="empleado")
	 private List<Ventas>lines;
	 
	 

	public List<Ventas> getLines() {
		return lines;
	}

	public void setLines(List<Ventas> lines) {
		this.lines = lines;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Empleados [empleadoId=" + empleadoId + ", nombre=" + nombre + ", fechaingreso=" + fechaingreso
				+ ", salario=" + salario + "]";
	}
	 
	 
	 
	 
}
