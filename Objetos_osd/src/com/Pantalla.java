package com;

public class Pantalla {
	//LED, LCD, CCFL, 
	String tipo;
	double pulgadas;
	//numero total de pixeles: 1024*768, 1366*768, 1920*1080, 
	String resolucion;
	
	
	public Pantalla() {
		
	}

	public Pantalla(String tipo, double pulgadas, String resolucion) {
		super();
		this.tipo = tipo;
		this.pulgadas = pulgadas;
		this.resolucion = resolucion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}

	@Override
	public String toString() {
		return "Pantalla [tipo=" + tipo + ", pulgadas=" + pulgadas + ", resolucion=" + resolucion + "]";
	}
	
	
	
	
}
