package com;

public class  Cuadrado extends FigurasGeo implements Calculos {
	
	private double lado;

	  public Cuadrado() {
		  
	  }

	public Cuadrado(double lado) {
		super();
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}

	@Override
	public double Area() {
		// TODO Auto-generated method stub
		return Math.pow(this.lado, 2);
	}

	@Override
	public double Perimetro() {
		// TODO Auto-generated method stub
		return this.lado*4 ;
	}

	@Override
	public double Volumen() {
		// TODO Auto-generated method stub
		return Math.pow(this.lado, 3);
	}

}

