package com;

public class Lentes {

	

	
	//atributos
	String color;
	String forma;
	String tama�o;
	String tipo;
	String grosor;
	
	
public Lentes() {
		
	}

	


	public Lentes(String color, String forma, String tama�o, String tipo, String grosor) {
	super();
	this.color = color;
	this.forma = forma;
	this.tama�o = tama�o;
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


	public String getTama�o() {
		return tama�o;
	}


	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
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
		return "Lentes [color=" + color + ", forma=" + forma + ", tama�o=" + tama�o + ", tipo=" + tipo + ", grosor="
				+ grosor + "]";
	}

	
	
}
