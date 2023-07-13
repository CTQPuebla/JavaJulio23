package com;

public class Circulo extends FiguraGeometrica implements Calculos{
	
	double radio;
	
	//CONSTRUCTOR
	public Circulo() {
		
	}
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	//SETTERS Y GETTERS
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
	//toString 
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}
	
	
	//Forma 1: Metodo nativo
		public double perimetroCir(double radio) {
			return 2*Math.PI*radio;
		}
		//----------------------------------------
	@Override
	public double perimetro(double numero) {
		// TODO Auto-generated method stub
		return 2 * 	Math.PI * numero;
	}
	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * this.radio;
	}
	@Override
	public double area(double numero) {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(numero, 2);
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(this.radio, 2);
	}
	@Override
	public double volumen() {
		// TODO Auto-generated method stub
		return 1.3 * Math.PI * Math.pow(this.radio, 3);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
