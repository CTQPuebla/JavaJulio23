package com;

public class Motor {
	String tipo;
	int nunCilindros;
	double cilindrada;
	double hp;
	String combustible;
	
	public Motor() {
		
		
	}

	

	public Motor(String tipo, int nunCilindros, double cilindrada, double hp, String combustible) {
		
		this.tipo = tipo;
		this.nunCilindros = nunCilindros;
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

	public int getNunCilindros() {
		return nunCilindros;
	}

	public void setNunCilindros(int nunCilindros) {
		this.nunCilindros = nunCilindros;
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
	
	

	public double getCilindrada() {
		return cilindrada;
	}



	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}



	@Override
	public String toString() {
		return "Motor [tipo=" + tipo + ", nunCilindros=" + nunCilindros + ", hp=" + hp + ", combustible=" + combustible
				+ "]";
	}
	
	
	

}// fin de la clase




