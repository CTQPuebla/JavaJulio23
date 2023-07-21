package com;

public class Hexagono extends FiguraGeometrica implements Calculos {
	double apotema;
	double lado;
	double altura;
	
	
	
	public Hexagono() {
		
	}
	


	public Hexagono(double apotema, double lado, double altura) {
		super();
		this.apotema = apotema;
		this.lado = lado;
		this.altura = altura;
	}


	public double getApotema() {
		return apotema;
	}

	public void setApotema(double apotema) {
		this.apotema = apotema;
	}



	@Override
	public String toString() {
		return "Hexagono [apotema=" + apotema + ", lado=" + lado + ", altura=" + altura + "]";
	}



	 @Override
	 public double perimetro1(double numero) {
	  // TODO Auto-generated method stub
	  return numero * 6;
	 }

	 @Override
	 public double perimetro2() {
	  // TODO Auto-generated method stub
	  return this.lado * 6;
	 }

	 @Override
	 public double area(double numero2) {
	  // TODO Auto-generated method stub
	  return (this.perimetro2()* numero2)/2;
	 }

	 @Override
	 public double area() {
	  // TODO Auto-generated method stub
	  return (this.perimetro2()* this.apotema)/2;
	 }

	 @Override
	 public double volumen() {
	  // TODO Auto-generated method stub
	  return 3*this.lado *this.apotema * this.altura;
	 }

	
	
	
}
