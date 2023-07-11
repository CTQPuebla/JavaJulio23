package com;

public class motor {

	String tipo;
	int numcilindros;
	double cilindrado;
	double hp;
	String combustible;
	
	public motor() {
		
	}
	
	public motor(String tipo, int numcilindros, double cilindrado, double hp, String combustible) {
		super();
		this.tipo = tipo;
		this.numcilindros = numcilindros;
		this.cilindrado = cilindrado;
		this.hp = hp;
		this.combustible = combustible;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public int getNumcilindros() {
		return numcilindros;
	}



	public void setNumcilindros(int numcilindros) {
		this.numcilindros = numcilindros;
	}



	public double getCilindrado() {
		return cilindrado;
	}



	public void setCilindrado(double cilindrado) {
		this.cilindrado = cilindrado;
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
		return "motor [tipo=" + tipo + ", numcilindros=" + numcilindros + ", cilindrado=" + cilindrado + ", hp=" + hp
				+ ", combustible=" + combustible + "]";
	}

	
	
	
}
