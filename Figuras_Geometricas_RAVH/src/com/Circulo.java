package com;

public class Circulo extends FigurasGeometricas implements Operaciones {
     
	double radio;
	
	public Circulo() {
		
	}

	//////////////////////
	public Circulo(double radio) {
		super();
		this.radio = radio;
		
	}
	
	/////////////////////

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}



/////////////////// 
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(this.radio,2);
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2*Math.PI*this.radio;
	}

	@Override
	public double volumen() {
		// TODO Auto-generated method stub
		return 1.3*Math.PI*Math.pow(this.radio,3);
	}

    
	
	
	
	
	
}
