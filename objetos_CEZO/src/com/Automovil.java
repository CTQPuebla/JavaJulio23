package com;

public class Automovil {
	
	String color;
	int puertas;
	int pasajeros;
	boolean encendido;
	
	
	public Automovil() {
		
	}

	// boton derecho- Source- Generate Constructor using Fields
	
	
	public Automovil(String color, int puertas, int pasajeros, boolean encendido) {
		
		this.color = color;
		this.puertas = puertas;
		this.pasajeros = pasajeros;
		this.encendido = encendido;
	}

	
	
	
	
	// Getters & setters
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	
	
	// generate to String
	
	
	@Override
	public String toString() {
		return "Automovil [color=" + color + ", puertas=" + puertas + ", pasajeros=" + pasajeros + ", encendido="
				+ encendido + "]";
	}
	
	
	

}
