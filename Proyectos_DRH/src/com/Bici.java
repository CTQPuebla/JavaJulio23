package com;

public class Bici {

	String marca;
	String tipo;
	String modelo;
	String cadena;
	//Todos los valores son requeridos desde el inicio
	public Bici () {
		
	}
	public Bici(String marca, String tipo, String modelo, String cadena) {
	
		this.marca = marca;
		this.tipo = tipo;
		this.modelo = modelo;
		this.cadena = cadena;
		
		
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setCadena(String cadena) {
		this.cadena = cadena;
		
	}
	@Override
	public String toString() {
		return "Bici [marca=" + marca + ", tipo=" + tipo + ", modelo=" + modelo + ", cadena=" + cadena + "]";
	}
	
}
