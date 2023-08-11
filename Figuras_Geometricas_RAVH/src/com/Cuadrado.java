package com;
public  class Cuadrado extends FigurasGeometricas implements Operaciones{
	
	double lado;
	public Cuadrado () {
		
	}

	////////////////////////
	public Cuadrado(double lado) {
		super();
		this.lado = lado;
		
	}

   ///////////////////////
	
	

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	
	
	
	//////////////////////////////
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.lado*this.lado;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return this.lado*4;
	}

	@Override
	public double volumen() {
		// TODO Auto-generated method stub
		return Math.pow(this.lado, 3);
	}

	

	


	
	
	
	

}
