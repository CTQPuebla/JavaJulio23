package com;

public class Automovil {

	String marca, modelo, color, tipo, tamaño;
	int cilindraje, velocidad, pasajeros;
	
	public Automovil() {
		
	}

	//Llamamos nuestros valores
	public Automovil(String marca, String modelo, String color, String tipo, String tamaño, int cilindraje,
			int velocidad, int pasajeros) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.tipo = tipo;
		this.tamaño = tamaño;
		this.cilindraje = cilindraje;
		this.velocidad = velocidad;
		this.pasajeros = pasajeros;
	}
	
	//Damos valores a nuestros atributos

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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

	@Override
	public String toString() {
		return "Automovil [marca=" + marca + "\nModelo=" + modelo + "\nColor=" + color + "\nTipo=" + tipo + "\nTamaño="
				+ tamaño + "\nCilindraje=" + cilindraje + "\nVelocidad=" + velocidad + "\nPasajeros=" + pasajeros + "]";
	}
	
	
	
}
