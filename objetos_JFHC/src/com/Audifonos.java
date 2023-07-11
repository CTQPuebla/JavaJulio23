package com;

public class Audifonos {
	
	/*
	 * Atributos
	 * Metodos constructores
	 * Getters & setters
	 * to String()
	 * 
	 * comportamiento
	 *    
	 */
	String color, marca, modelo, tamaño,
	tipo, conectividad;
	int botones;
	double frecuencia;
	
	//Constructores
	/*
	 * Mecanismo para establecer un estado inicial
	 * de los atributos
	 */
	
	public Audifonos() {
		
	}
      //Todos los valores son requeridos desde el inicio
	public Audifonos(String color, String marca, String modelo, String tamaño, String tipo, String conectividad,
			int botones, double frecuencia) {
		
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.tamaño = tamaño;
		this.tipo = tipo;
		this.conectividad = conectividad;
		this.botones = botones;
		this.frecuencia = frecuencia;
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
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getConectividad() {
		return conectividad;
	}
	public void setConectividad(String conectividad) {
		this.conectividad = conectividad;
	}
	public int getBotones() {
		return botones;
	}
	public void setBotones(int botones) {
		this.botones = botones;
	}
	public double getFrecuencia() {
		return frecuencia;
	}
	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}
	@Override
	public String toString() {
		return "Audifonos [color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", tamaño=" + tamaño
				+ ", tipo=" + tipo + ", conectividad=" + conectividad + ", botones=" + botones + ", frecuencia="
				+ frecuencia + "]";
	}
	

}
