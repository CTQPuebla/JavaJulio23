package com;

public class Figuras_geometricas {
     
	
	String nombre;
	
	public Figuras_geometricas() {
		
	}

	public Figuras_geometricas(String nombre) {
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
		return "Figuras_geometricas [nombre=" + nombre + "]";
	}
	
	
	

}
