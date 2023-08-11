package com;

public class CalculadoraCientifica extends calculadora implements opCientificas{

	
	public CalculadoraCientifica() {
		
	}
	
// forma 1 metodo nativo	
	
	public double potencia(double base, double exponente) {
		return Math.pow(base, exponente);
			
	}
	
	// forma 2: metodo heredados(de clase abstracta o no) y sobreescritos
	
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

	
	//forma3: metodo traido de una interfase
	@Override
	public double raiz(double num) {
		// TODO Auto-generated method stub
		return Math.sqrt(num);
	}

	@Override
	public double seno(double angulo) {
		// TODO Auto-generated method stub
		return Math.sin(angulo);
	}

	@Override
	public double tangente(double angulo) {
		// TODO Auto-generated method stub
		return Math.tan(angulo);
	}

	
	
}
