package com;

public class Procesador {
	
	String marca, modelo;
	int nucleos;
	

	public Procesador() {
		
	}


	public Procesador(String marca, String modelo, int nucleos) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.nucleos = nucleos;
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


	public int getNucleos() {
		return nucleos;
	}


	public void setNucleos(int nucleos) {
		this.nucleos = nucleos;
	}


	@Override
	public String toString() {
		return "Procesador [marca=" + marca + ", modelo=" + modelo + ", nucleos=" + nucleos + "]";
	}
	
	
	
	
	
}
