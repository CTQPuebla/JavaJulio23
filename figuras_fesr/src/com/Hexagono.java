package com;

public class Hexagono  extends FigurasGeo implements Calculos{
	public Hexagono() {
	
	} 
	private double apotema;
	private double altura;
	private double lado;
	public Hexagono(double apotema, double altura, double lado) {
		super();
		this.apotema = apotema;
		this.altura = altura;
		this.lado = lado;
	}
	
	public double getApotema() {
		return apotema;
	}
	public void setApotema(double apotema) {
		this.apotema = apotema;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	@Override
	public String toString() {
		return "Hexagono [apotema=" + apotema + ", altura=" + altura + ", lado=" + lado + "]";
	}	
	
	@Override
	public double Perimetro() {
		// TODO Auto-generated method stub
		return this.lado*6;
		
	}
	@Override
	public double Area() {
		// TODO Auto-generated method stub
		return (this.Perimetro()*this.apotema)/2 ;
	}

	@Override
	public double Volumen() {
		// TODO Auto-generated method stub
		return 3*this.lado *this.apotema * this.altura;
	}


    
	
}

