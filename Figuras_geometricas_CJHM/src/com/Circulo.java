package com;

public class Circulo extends Figuras_geometricas implements Calculo{
	
	
	double radio;
	
	public Circulo() {
		
	}
	
	

	
	public Circulo(double radio) {
		
		this.radio = radio;
	}




	public double getRadio() {
		return radio;
	}




	public void setRadio(double radio) {
		this.radio = radio;
	}




	@Override
	public double area(double num) {
		// TODO Auto-generated method stub
		return Math.PI* Math.pow(radio, 2);
							
	}

	@Override
	public double perimetro(double lado) {
		// TODO Auto-generated method stub
		return 2*Math.PI*radio;  
	}

	@Override
	public double volumen(double lado) {
		// TODO Auto-generated method stub
		return 4/3*Math.PI*Math.pow(radio, 3);
	}
	
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI* Math.pow(this.radio, 2);
							
	}

	
	
}
