package com;

public abstract class calculadora {
	
	
	String marca;
	String modelo;
	  
	
	public calculadora() {
		
	}


	public calculadora(String marca, String modelo) {
		
		this.marca = marca;
		this.modelo = modelo;
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


	@Override
	public String toString() {
		return "calculadora [marca=" + marca + ", modelo=" + modelo + "]";
	}

	
	//metodo abstractos
	public abstract double sumar(double a,double b);
	public abstract double restar(double a,double b);
	public abstract double multiplicar(double a, double b);
	
	
}
