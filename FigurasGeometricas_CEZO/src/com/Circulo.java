package com;

public class Circulo extends FiguraGeometrica implements Calculos{
	double radio;
	
	public Circulo() {
		
	}
	
	
	

	public Circulo( double radio) {
		
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

	
	@Override
	public double perimetro1(double numero) {
		
		return Math.PI * numero * 2;
	}
	
	@Override
	public double perimetro2() {
		
		return Math.PI * this.radio * 2;
	}
	@Override
	public double area(double numero2) {
		
		return Math.PI * Math.pow(numero2, 2);
	}

	
	@Override
	public double area() {
		
		return Math.PI * Math.pow(this.radio, 2);
	}
	
	

	@Override
	public double volumen() {
		// TODO Auto-generated method stub
		 return 1.3 * Math.PI * Math.pow(this.radio, 3);
	}




	
	
	

}
