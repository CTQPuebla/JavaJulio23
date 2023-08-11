package com;

public class CalculadoraCientifica extends Calculadora implements OpCientificas {

	public CalculadoraCientifica() {
	   	
	}
	//Forma 1: Metodo Nativo
     public double potencia(double base, double exponenete) {
    	 return Math.pow(base,exponenete);
    	 
     }
	
	//Gorma 2: Metodos heredados (de clase abstracta o no) y sobreescritos
     
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
	
	//Forma3: Métodos traídos de una interface
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
