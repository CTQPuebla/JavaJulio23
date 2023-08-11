package com.persistence.entity;

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

@Entity
@Table(name="VENTAS")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "ventaId")
public class Ventas implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cid_auto")
	@SequenceGenerator(name="cid_auto", sequenceName="VENTAS_SEQ", allocationSize=1)
	@Column(name="VENTA_ID", columnDefinition="NUMBER")
	private int ventaId;

	@ManyToOne
	@JoinColumn(name="EMPLEADO_ID", columnDefinition = "NUMBER")
	private Empleados empleado;
	//private int empleadoId;
	
	@ManyToOne
	@JoinColumn(name="CLIENTE_ID", columnDefinition = "NUMBER")
	private Clientes cliente;
	//private int clienteId;
	
	@Column(name="FECHA_VENTA", columnDefinition = "DATE")
	private Date fechaVenta;
	@Column(name="SUBTOTAL", columnDefinition = "NUMBER(5,2)")
	private double subtotal;
	@Column(name="TOTAL", columnDefinition = "NUMBER(5,2)")
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
	public Clientes getCliente() {
		return cliente;
	}
	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}
	public Date getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
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
	
	
	

}
