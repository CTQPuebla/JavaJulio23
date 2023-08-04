package com.Persistence.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "ventaId")
@Entity
@Table(name="VENTAS")
public class Ventas implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//Aqui ya no es necesario los constructores
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	 @SequenceGenerator(name="cid_auto",sequenceName="VENTAS_SEQ", allocationSize=1)
	 
	 @Column(name="VENTA_ID",columnDefinition="NUMBER")
	 private int ventaId;
	 @ManyToOne
	 @JoinColumn(name="EMPLEADO_ID",columnDefinition="NUMBER")
	 private Empleados empleado;
	 @ManyToOne
	 @JoinColumn(name="CLIENTE_ID",columnDefinition="NUMBER")
	 private Cliente cliente;
	 
		 
	 @Column(name="FECHA_VENTA",columnDefinition="DATE")
	 private Date fechaventa;
	 
	 @Column(name="SUBTOTAL",columnDefinition="NUMBER")
	 private double subtotal;
	 
	 @Column(name="TOTAL",columnDefinition="NUMBER")
	 private double total;
	 
	 

	public int getVentaId() {
		return ventaId;
	}

	public void setVentaId(int ventaId) {
		this.ventaId = ventaId;
	}

	public Empleados getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleados empleado) {
		this.empleado = empleado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getFechaventa() {
		return fechaventa;
	}

	public void setFechaventa(Date fechaventa) {
		this.fechaventa = fechaventa;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Ventas [ventaId=" + ventaId + ", empleado=" + empleado + ", cliente=" + cliente + ", fechaventa="
				+ fechaventa + ", subtotal=" + subtotal + ", total=" + total + "]";
	}



}
