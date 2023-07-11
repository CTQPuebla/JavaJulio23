package com;

public class Pantalla {
	
	String color, marca, calidad;
	double resolucion;
	
	public Pantalla(){
		
	}

	public Pantalla(String color, String marca, String calidad, double resolucion) {
		super();
		this.color = color;
		this.marca = marca;
		this.calidad = calidad;
		this.resolucion = resolucion;
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

	public String getCalidad() {
		return calidad;
	}

	public void setCalidad(String calidad) {
		this.calidad = calidad;
	}

	public double getResolucion() {
		return resolucion;
	}

	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}

	@Override
	public String toString() {
		return "Pantalla [color=" + color + ", marca=" + marca + ", calidad=" + calidad + ", resolucion=" + resolucion
				+ "]";
	}
	
	

}
