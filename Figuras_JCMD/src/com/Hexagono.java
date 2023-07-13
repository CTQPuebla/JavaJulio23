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
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Hexagono [apotema=" + apotema + ", lado=" + lado + ", altura=" + altura + "]";
	}
	@Override
	public double perimetro(double numero) {
		// TODO Auto-generated method stub
		return numero*6;
	}
	@Override
	public double permietro() {
		// TODO Auto-generated method stub
		return (this.lado*6);
	}
	@Override
	public double area(double numero) {
		// TODO Auto-generated method stub
		return (this.permietro()*numero/2);
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (this.permietro()*this.permietro());
	}
	@Override
	public double volumen() {
		// TODO Auto-generated method stub
		return 3*this.lado*this.apotema*this.altura;
	}

	
	

	
	
	
	
	

}
