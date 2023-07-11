package com;

public class Pantalla {
	String tipo;
	double pulgadas;
	
	public Pantalla() {
		
	}

	public Pantalla(String tipo, double pulgadas) {
		super();
		this.tipo = tipo;
		this.pulgadas = pulgadas;
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

	@Override
	public String toString() {
		return "Pantalla [tipo=" + tipo + ", pulgadas=" + pulgadas + "]";
	}
	

}
