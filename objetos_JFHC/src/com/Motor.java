package com;

public class Motor {
	
	String tipo, combustible;
	int numCilindros;
	double cilindrada, hp;
	
	public Motor() {
		
	}

	public Motor(String tipo, String combustible, int numCilindros, double cilindrada, double hp) {
		super();
		this.tipo = tipo;
		this.combustible = combustible;
		this.numCilindros = numCilindros;
		this.cilindrada = cilindrada;
		this.hp = hp;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public int getNumCilindros() {
		return numCilindros;
	}

	public void setNumCilindros(int numCilindros) {
		this.numCilindros = numCilindros;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	public double getHp() {
		return hp;
	}

	public void setHp(double hp) {
		this.hp = hp;
	}

	@Override
	public String toString() {
		return "Motor [tipo=" + tipo + ", combustible=" + combustible + ", numCilindros=" + numCilindros
				+ ", cilindrada=" + cilindrada + ", hp=" + hp + "]";
	}
	

}
