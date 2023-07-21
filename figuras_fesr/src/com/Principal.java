package com;

public class Principal {
	public static void main(String[] args) {

		Cuadrado c2 = new Cuadrado(5);
		Circulo c1 = new Circulo(3);
		Hexagono c3 = new Hexagono(5, 3, 4);

		System.out.println("Area del circulo: "+c1.Area());
		System.out.println("Perimetro del circulo: "+c1.Perimetro());
		System.out.println("Volumen del circulo: "+c1.Volumen());
		
		System.out.println("Area del cuadrado: "+c2.Area());
		System.out.println("Perimetro del cuadrado: "+c2.Perimetro());
		System.out.println("Volumen del cuadrado: "+c2.Volumen());
		
		System.out.println("Area del Hexagono: "+c3.Area());
		System.out.println("Perimetro del Hexagono: "+c3.Perimetro());
		System.out.println("Volumen del Hexagono: "+c3.Volumen());

	}
}
