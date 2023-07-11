package com;

public class Celular {
	
	String color, marca, modelo;
	double dimensiones;
	int botones;
	
	public Celular() {
		
	}
	public Celular(String color, String marca, String modelo, double dimensiones, int botones) {
		super();
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.dimensiones = dimensiones;
		this.botones = botones;
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
	public double getDimensiones() {
		return dimensiones;
	}
	public void setDimensiones(double dimensiones) {
		this.dimensiones = dimensiones;
	}
	public int getBotones() {
		return botones;
	}
	public void setBotones(int botones) {
		this.botones = botones;
	}
	@Override
	public String toString() {
		return "Celular [color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", dimensiones=" + dimensiones
				+ ", botones=" + botones + "]";
	}
	
	

}
