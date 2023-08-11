package com;

public class Motor {

	String tipo;
	int numCilindro;
	double cilindrada;
	double hp;
	String combustible;
	
	public Motor() {
		
	}

	public Motor(String tipo, int numCilindro, double cilindrada, double hp, String combustible) {
		super();
		this.tipo = tipo;
		this.numCilindro = numCilindro;
		this.cilindrada = cilindrada;
		this.hp = hp;
		this.combustible = combustible;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumCilindro() {
		return numCilindro;
	}

	public void setNumCilindro(int numCilindro) {
		this.numCilindro = numCilindro;
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

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	@Override
	public String toString() {
		return "Motor [tipo=" + tipo + ", numCilindro=" + numCilindro + ", cilindrada=" + cilindrada + ", hp=" + hp
				+ ", combustible=" + combustible + "]";
	}
	
	
}
