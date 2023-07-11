package com;

public class Motor {
	
	String tipo;
	int numCilindros;
	int Cilindrada;
	double hp;
	
	public Motor() {
		
	}

	public Motor(String tipo, int numCilindros, int cilindrada, double hp) {
		super();
		this.tipo = tipo;
		this.numCilindros = numCilindros;
		Cilindrada = cilindrada;
		this.hp = hp;
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

	public int getCilindrada() {
		return Cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		Cilindrada = cilindrada;
	}

	public double getHp() {
		return hp;
	}

	public void setHp(double hp) {
		this.hp = hp;
	}

	@Override
	public String toString() {
		return "Motor [tipo=" + tipo + ", numCilindros=" + numCilindros + ", Cilindrada=" + Cilindrada + ", hp=" + hp
				+ "]";
	}
	
	

}
