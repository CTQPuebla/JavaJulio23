package com;
  
public class Circulo extends FiguraGeometrica implements Calculos {
	
	double radio;
	
	public Circulo() {
		
	}
	

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}
	


	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}


	public double getRadio() {
		return radio;
	}


	public void setRadio(double radio) {
		this.radio = radio;
	}


	@Override
	public double area(double a) {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radio, 2);
	}

	@Override
	public double perimetro(double b) {
		// TODO Auto-generated method stub
		return 2*Math.PI*radio;
	}

	@Override
	public double volumen(double c) {
		// TODO Auto-generated method stub
		return 4/3*Math.PI*Math.pow(radio, 3);
	}
	
	

	
	
}
