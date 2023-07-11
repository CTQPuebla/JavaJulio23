package com;

public class Bateria {

	String marca,color;
	double voltajeEntrada;
	
	
	public Bateria() {
		
	}


	public Bateria(String marca, String color, double voltajeEntrada) {
		super();
		this.marca = marca;
		this.color = color;
		this.voltajeEntrada = voltajeEntrada;
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


	public double getVoltajeEntrada() {
		return voltajeEntrada;
	}


	public void setVoltajeEntrada(double voltajeEntrada) {
		this.voltajeEntrada = voltajeEntrada;
	}


	@Override
	public String toString() {
		return "Bateria [marca=" + marca + ", color=" + color + ", voltajeEntrada=" + voltajeEntrada + "]";
	}
	
}
