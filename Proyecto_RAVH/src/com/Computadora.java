package com;

import java.util.Arrays;

public class Computadora {
	
	String color, marca, modelo, tipo;
	float tama�o, velocidadProcesador;
	Software software;
	
	String[] teclas;
	
	public Computadora() {
		
	}

	//CONSTRUCTORES
	public Computadora(String color, String marca, String modelo, String tipo, float tama�o, float velocidadProcesador,
			Software software, String[] teclas) {
		
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.tama�o = tama�o;
		this.velocidadProcesador = velocidadProcesador;
		this.software = software;
		this.teclas = teclas;
	}
	
	//METODO GET-SET PARA AGREGAR VALORES A ATRIBUTOS

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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getTama�o() {
		return tama�o;
	}

	public void setTama�o(float tama�o) {
		this.tama�o = tama�o;
	}

	public float getVelocidadProcesador() {
		return velocidadProcesador;
	}

	public void setVelocidadProcesador(float velocidadProcesador) {
		this.velocidadProcesador = velocidadProcesador;
	}

	public Software getSoftware() {
		return software;
	}

	public void setSoftware(Software software) {
		this.software = software;
	}

	public String[] getTeclas() {
		return teclas;
	}

	public void setTeclas(String[] teclas) {
		this.teclas = teclas;
	}

	
	//METODO toString
	@Override
	public String toString() {
		return "Computadora [color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo
				+ ", tama�o=" + tama�o + ", velocidadProcesador=" + velocidadProcesador + ", software=" + software
				+ ", teclas=" + Arrays.toString(teclas) + "]";
	}
	
	
	
	

}
