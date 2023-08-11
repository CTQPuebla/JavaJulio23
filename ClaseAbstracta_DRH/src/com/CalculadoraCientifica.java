package com;

public class CalculadoraCientifica extends Calculadora implements OpCientificas{

	public CalculadoraCientifica() {
		
	}
	//Forma 1 :metodo nativo
	public double potencia(double base, double exponente) {
		return Math.pow(base, exponente);
		
	}

	
	
	//Forma2 : Metodos heredados (de la clase abstracta o no) y sobrescritos
	@Override
	public double sumar(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double restar(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double multiplicar(double a, double b) {
		// TODO Auto-generated method stub
		return a*b;
	}
	
	
	//Forma3 Metodos traidos de una interface 
	@Override
	public double raiz(double num) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double seno(double angulo) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double tangente(double angulo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
