package com;

import java.util.Arrays;

public class Laptop {
	
	String modelo;
	String color;
	String alamcenamiento;
	
	String[] caract;
			
	Pantalla pantalla;
	Procesador procesador;
	
	public Laptop() {
		
	}

	
	
	public Laptop(String modelo, String color, String alamcenamiento, String[] caract, Pantalla pantalla,
			Procesador procesador) {
		super();
		this.modelo = modelo;
		this.color = color;
		this.alamcenamiento = alamcenamiento;
		this.caract = caract;
		this.pantalla = pantalla;
		this.procesador = procesador;
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



	public String getAlamcenamiento() {
		return alamcenamiento;
	}



	public void setAlamcenamiento(String alamcenamiento) {
		this.alamcenamiento = alamcenamiento;
	}



	public String[] getCaract() {
		return caract;
	}



	public void setCaract(String[] caract) {
		this.caract = caract;
	}



	public Pantalla getPantalla() {
		return pantalla;
	}



	public void setPantalla(Pantalla pantalla) {
		this.pantalla = pantalla;
	}



	public Procesador getProcesador() {
		return procesador;
	}



	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}



	@Override
	public String toString() {
		return "Laptop [modelo=" + modelo + ", color=" + color + ", alamcenamiento=" + alamcenamiento + ", caract="
				+ Arrays.toString(caract) + ", pantalla=" + pantalla + ", procesador=" + procesador + "]";
	}
	
	
	
	
}
