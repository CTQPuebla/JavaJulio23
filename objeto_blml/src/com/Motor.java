package com;

public class Motor {
	String tipo;
	int numCilindros;
	double cilindrada;
	double hp;
	String combustible;
	
	public Motor () {
		
	}

	public Motor(String tipo, int numCilindros, double cilindrada, double hp, String combustible) {
		super();
		this.tipo = tipo;
		this.numCilindros = numCilindros;
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

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	@Override
	public String toString() {
		return "Motor [tipo=" + tipo + ", numCilindros=" + numCilindros + ", cilindrada=" + cilindrada + ", hp=" + hp
				+ ", combustible=" + combustible + "]";
	}

	
	
}
