package com;

public class Carro {

	String color;
	String marca;
	String modelo;
	String transmision;
	int capacidad;

	
	public Carro(){
		
	}


	public Carro(String color, String marca, String modelo, String transmision, int capacidad) {
		
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.transmision = transmision;
		this.capacidad = capacidad;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getTransmision() {
		return transmision;
	}


	public void setTransmision(String transmision) {
		this.transmision = transmision;
	}


	public int getCapacidad() {
		return capacidad;
	}


	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}


	@Override
	public String toString() {
		return "Carro [color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", transmision=" + transmision
				+ ", capacidad=" + capacidad + "]";
	}
	
	
	
	
}
