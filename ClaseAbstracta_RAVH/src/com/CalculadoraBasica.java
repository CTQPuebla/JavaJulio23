package com;

public  class CalculadoraBasica extends Calculadora {
	
	public CalculadoraBasica() {
		
	}

	@Override
	public double sumar(double a, double b) {
		
		return a+b;
	}

	@Override
	public double restar(double a, double b) {
	
		return a-b;
	}

	@Override
	public double multiplicar(double a, double b) {
	
		return a*b;
	}

}
