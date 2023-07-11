package com;

public class Procesador {

	String marca;
	String modelo;
	int generacion;
	int NumNucleos;
	double velocidas;
	
	
	
	
	public Procesador() {
		
	}




	public Procesador(String marca, String modelo, int generacion, int numNucleos, double velocidas) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.generacion = generacion;
		NumNucleos = numNucleos;
		this.velocidas = velocidas;
	}




	public String getMarca() {
		return marca;
	}




	public void setMarca(String marca) {
		this.marca = marca;
	}




	public String getModelo() {
		return modelo;
	}




	public void setModelo(String modelo) {
		this.modelo = modelo;
	}




	public int getGeneracion() {
		return generacion;
	}




	public void setGeneracion(int generacion) {
		this.generacion = generacion;
	}




	public int getNumNucleos() {
		return NumNucleos;
	}




	public void setNumNucleos(int numNucleos) {
		NumNucleos = numNucleos;
	}




	public double getVelocidas() {
		return velocidas;
	}




	public void setVelocidas(double velocidas) {
		this.velocidas = velocidas;
	}




	@Override
	public String toString() {
		return "Procesador [marca=" + marca + ", modelo=" + modelo + ", generacion=" + generacion + ", NumNucleos="
				+ NumNucleos + ", velocidas=" + velocidas + "]";
	}
	
	
	
	
	
}

