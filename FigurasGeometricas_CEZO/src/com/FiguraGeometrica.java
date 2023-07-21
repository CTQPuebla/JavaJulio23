package com;

public class FiguraGeometrica {

	String nombre;
	
	public FiguraGeometrica() {
		
	}

	public FiguraGeometrica(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "FiguraGeometrica [nombre=" + nombre + "]";
	}

	
	
	
}
