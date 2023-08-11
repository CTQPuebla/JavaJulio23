package com;

public class Lentes {

	

	
	//atributos
	String color;
	String forma;
	String tamaño;
	String tipo;
	String grosor;
	
	
public Lentes() {
		
	}

	


	public Lentes(String color, String forma, String tamaño, String tipo, String grosor) {
	super();
	this.color = color;
	this.forma = forma;
	this.tamaño = tamaño;
	this.tipo = tipo;
	this.grosor = grosor;
}




	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getForma() {
		return forma;
	}


	public void setForma(String forma) {
		this.forma = forma;
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


	public String getGrosor() {
		return grosor;
	}


	public void setGrosor(String grosor) {
		this.grosor = grosor;
	}


	@Override
	public String toString() {
		return "Lentes [color=" + color + ", forma=" + forma + ", tamaño=" + tamaño + ", tipo=" + tipo + ", grosor="
				+ grosor + "]";
	}

	
	
}
