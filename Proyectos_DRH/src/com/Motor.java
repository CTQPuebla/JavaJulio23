package com;

public class Motor {

	String tipo;
	int numCilindros;
	double Cilindros;
	double  hp;
	String combustible;
	
	public Motor () {
		
	}

	public Motor(String tipo, int numCilindros, double cilindros, double hp, String combustible) {
		this.tipo = tipo;
		this.numCilindros = numCilindros;
		Cilindros = cilindros;
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

	public double getCilindros() {
		return Cilindros;
	}

	public void setCilindros(double cilindros) {
		Cilindros = cilindros;
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
		return "Motor [tipo=" + tipo + ", numCilindros=" + numCilindros + ", Cilindros=" + Cilindros + ", hp=" + hp
				+ ", combustible=" + combustible + "]";
	}
	
	
}
