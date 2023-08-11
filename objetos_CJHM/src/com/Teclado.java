package com;

public class Teclado {

	
	String marca;
	String idioma;
	String color;
	
	
	public Teclado() {
		
	}


	public Teclado(String marca, String idioma, String color) {
		super();
		this.marca = marca;
		this.idioma = idioma;
		this.color = color;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getIdioma() {
		return idioma;
	}


	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Teclado [marca=" + marca + ", idioma=" + idioma + ", color=" + color + "]";
	}
	
	
	
	
}
