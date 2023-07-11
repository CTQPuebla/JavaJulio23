package com;

public class Laptop {

	String color;
	String marca;
	String modelo;
	String procesador;
	String tamaño;
	String grafica;
	boolean RGB;
	
	
	
	public Laptop() {
		
		
	}



	public Laptop(String color, String marca, String modelo, String procesador, String tamaño, String grafica,
			boolean rGB) {
		super();
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.procesador = procesador;
		this.tamaño = tamaño;
		this.grafica = grafica;
		RGB = rGB;
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



	public String getProcesador() {
		return procesador;
	}



	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}



	public String getTamaño() {
		return tamaño;
	}



	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}



	public String getGrafica() {
		return grafica;
	}



	public void setGrafica(String grafica) {
		this.grafica = grafica;
	}



	public boolean isRGB() {
		return RGB;
	}



	public void setRGB(boolean rGB) {
		RGB = rGB;
	}



	@Override
	public String toString() {
		return "computadora [color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", procesador=" + procesador
				+ ", tamaño=" + tamaño + ", grafica=" + grafica + ", RGB=" + RGB + "]";
	}
	
	
}
