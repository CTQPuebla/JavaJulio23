package com;

public class Zapatos {
	String color;
	String marca;
	String modelo;
	String tama�o;
	// Todos los valores son  requeridos desde el inicio
	public Zapatos() {
		
	}
	
	public Zapatos(String color, String marca, String modelo, String tama�o) {
		
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.tama�o = tama�o;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	@Override
	public String toString() {
		return "Zapatos [color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", tama�o=" + tama�o + "]";
	}
	
		
	
	
	
	
}// fin de clase


	


