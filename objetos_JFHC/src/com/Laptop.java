package com;

public class Laptop {
	
	String color, marca, modelo;
	Microprocesador microprocesador;
	Teclado teclado;
	Pantalla pantalla;
	Bateria bateria;
	
	
	public Laptop() {
		
	}


	public Laptop(String color, String marca, String modelo, Microprocesador microprocesador, Teclado teclado,
			Pantalla pantalla, Bateria bateria) {
		super();
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.microprocesador = microprocesador;
		this.teclado = teclado;
		this.pantalla = pantalla;
		this.bateria = bateria;
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


	public Microprocesador getMicroprocesador() {
		return microprocesador;
	}


	public void setMicroprocesador(Microprocesador microprocesador) {
		this.microprocesador = microprocesador;
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
		return "Laptop [color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", microprocesador="
				+ microprocesador + ", teclado=" + teclado + ", pantalla=" + pantalla + ", bateria=" + bateria + "]";
	}
	
	
	
	

}



