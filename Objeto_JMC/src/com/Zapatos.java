package com;

public class Zapatos {
	String color;
	String marca;
	String modelo;
	String tamaño;
	// Todos los valores son  requeridos desde el inicio
	public Zapatos() {
		
	}
	
	public Zapatos(String color, String marca, String modelo, String tamaño) {
		
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.tamaño = tamaño;
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

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Zapatos [color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", tamaño=" + tamaño + "]";
	}
	
		
	
	
	
	
}// fin de clase


	


