package com;

public class CalculadoraCientifica extends Calculadora implements OpCientificas {

	public CalculadoraCientifica() {

	}

	// modo nativo
	public double potencia(double base, double exponente) {
		return Math.pow(base, exponente);
	}

// metodo heredado
	@Override
	public double sumar(double a, double b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public double restar(double a, double b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public double multiplicar(double a, double b) {
		// TODO Auto-generated method stub
		return a * b;
	}

//con interfaces
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
