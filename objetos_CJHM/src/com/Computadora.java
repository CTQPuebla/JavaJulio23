package com;

public class Computadora {

	String marca;
	String color;
	String modelo;
	Procesador procesador;
	Teclado teclado;
	Pantalla pantalla;
	Bateria bateria;
	
	public Computadora() {
		
	}

	public Computadora(String marca, String color, String modelo, Procesador procesador, Teclado teclado,
			Pantalla pantalla, Bateria bateria) {
		super();
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.procesador = procesador;
		this.teclado = teclado;
		this.pantalla = pantalla;
		this.bateria = bateria;
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

	public Teclado getTeclado() {
		return teclado;
	}

	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}

	public Pantalla getPantalla() {
		return pantalla;
	}

	public void setPantalla(Pantalla pantalla) {
		this.pantalla = pantalla;
	}

	public Bateria getBateria() {
		return bateria;
	}

	public void setBateria(Bateria bateria) {
		this.bateria = bateria;
	}

	@Override
	public String toString() {
		return "Computadora [marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", procesador=" + procesador
				+ ", teclado=" + teclado + ", pantalla=" + pantalla + ", bateria=" + bateria + "]";
	}
	
	
}
