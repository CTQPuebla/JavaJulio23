package com;

public class Cuadrado extends FiguraGeometrica  implements Calculos{
	
	double lado;
	
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
	public double area(double a) {
		// TODO Auto-generated method stub
		return lado*lado;
	}

	@Override
	public double perimetro(double b) {
		// TODO Auto-generated method stub
		return lado*4;
	}

	@Override
	public double volumen(double c) {
		// TODO Auto-generated method stub
		return Math.pow(lado, 3);
	}
	

}
