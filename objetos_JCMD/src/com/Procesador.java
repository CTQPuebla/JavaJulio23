package com;

public class Procesador {
	String marca;
	String generacion;
	int MHz;
	int nucleos;
	
	public Procesador() {
		
	}

	public Procesador(String marca, String generacion, int mHz, int nucleos) {
		super();
		this.marca = marca;
		this.generacion = generacion;
		MHz = mHz;
		this.nucleos = nucleos;
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

	public int getMHz() {
		return MHz;
	}

	public void setMHz(int mHz) {
		MHz = mHz;
	}

	public int getNucleos() {
		return nucleos;
	}

	public void setNucleos(int nucleos) {
		this.nucleos = nucleos;
	}

	@Override
	public String toString() {
		return "Procesador [marca=" + marca + ", generacion=" + generacion + ", MHz=" + MHz + ", nucleos=" + nucleos
				+ "]";
	}
	
	

}
