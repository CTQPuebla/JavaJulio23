package com;

public class Circulo extends FigurasGeo implements Calculos {
	
	double radio;
	
	public Circulo() {
	}

	public Circulo(double radio) {
		super();
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
	public double Area() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(this.radio, 2);
	}

	@Override
	public double Perimetro() {
		// TODO Auto-generated method stub
		return 2*this.radio*Math.PI;
	}

	@Override
	public double Volumen() {
		// TODO Auto-generated method stub
		return 3/4*(Math.PI*Math.pow(this.radio, 3));
	}
	
}
