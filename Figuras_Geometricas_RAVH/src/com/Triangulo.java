package com;

public  class Triangulo extends FigurasGeometricas implements Operaciones{
	
	double base, altura,lado;
	public Triangulo() {
		
	}
	
	////////////////////////
	public Triangulo(double base, double altura, double lado) {
		super();
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	}
	
	///////////////////////
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
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
		return "Triangulo [base=" + base + ", altura=" + altura + ", lado=" + lado + "]";
	}

	///////////////////////
	//
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return base*altura/2;
	}
	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return lado+lado+lado;
	}
	@Override
	public double volumen() {
		// TODO Auto-generated method stub
		return (base*altura/2)*altura;
	}
	


}
