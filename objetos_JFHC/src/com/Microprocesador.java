package com;

public class Microprocesador {
	
	String marca, generacion;
	int nucleos;
	double velocidad;
	
	public Microprocesador() {
		
	}

	public Microprocesador(String marca, String generacion, int nucleos, double velocidad) {
		super();
		this.marca = marca;
		this.generacion = generacion;
		this.nucleos = nucleos;
		this.velocidad = velocidad;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getGeneracion() {
		return generacion;
	}

	public void setGeneracion(String generacion) {
		this.generacion = generacion;
	}

	public int getNucleos() {
		return nucleos;
	}

	public void setNucleos(int nucleos) {
		this.nucleos = nucleos;
	}

	public double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public String toString() {
		return "Microprocesador [marca=" + marca + ", generacion=" + generacion + ", nucleos=" + nucleos
				+ ", velocidad=" + velocidad + "]";
	}
	
	

}
