package com;

public class FiguraGeometrica {
	
	public FiguraGeometrica() {
		
	}
	
	public String nombre;

	public FiguraGeometrica(String nombre) {
		super();
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
