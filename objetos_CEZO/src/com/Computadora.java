package com;

import java.util.Arrays;

public class Computadora {

	String marca, color, modelo;
	double peso, precio;
	
	
	Object[] hardware;


	public Computadora(String marca, String color, String modelo, double peso, double precio, Object[] hardware) {
		super();
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.peso = peso;
		this.precio = precio;
		this.hardware = hardware;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public Object[] getHardware() {
		return hardware;
	}


	public void setHardware(Object[] hardware) {
		this.hardware = hardware;
	}


	@Override
	public String toString() {
		return "Computadora [marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", peso=" + peso
				+ ", precio=" + precio + ", hardware=" + Arrays.toString(hardware) + "]";
	}
	
	
	
	
	
	
}
