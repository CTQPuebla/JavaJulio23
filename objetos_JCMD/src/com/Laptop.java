package com;

import java.util.Arrays;

public class Laptop {
	
	String marca;
	String color;
	String modelo;
	
	Procesador procesador;
	Pantalla pantalla;
	Almacenamiento almacenamiento;
	String[] general;
	
	public Laptop(){
		
	}

	public Laptop(String marca, String color, String modelo, Procesador procesador, Pantalla pantalla,
			Almacenamiento almacenamiento, String[] general) {
		super();
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.procesador = procesador;
		this.pantalla = pantalla;
		this.almacenamiento = almacenamiento;
		this.general = general;
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

	public Procesador getProcesador() {
		return procesador;
	}

	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}

	public Pantalla getPantalla() {
		return pantalla;
	}

	public void setPantalla(Pantalla pantalla) {
		this.pantalla = pantalla;
	}

	public Almacenamiento getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(Almacenamiento almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public String[] getGeneral() {
		return general;
	}

	public void setGeneral(String[] general) {
		this.general = general;
	}

	@Override
	public String toString() {
		return "Laptop [marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", procesador=" + procesador
				+ ", pantalla=" + pantalla + ", almacenamiento=" + almacenamiento + ", general="
				+ Arrays.toString(general) + "]";
	}
	
	
	
}
