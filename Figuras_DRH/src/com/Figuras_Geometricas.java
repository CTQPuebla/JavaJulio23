package com;

public class Figuras_Geometricas {

	public static void main(String[] args) {
		
		double area;
		double perimetro;
		double volumen;
		
		Cuadrado c1 = new Cuadrado(5);
		 Circulo o1 = new Circulo(10);
		 Hexagono h1 = new Hexagono(12, 32, 11);
		 //Resultado de Cuadrado 
		  System.out.println("Resultado de cuadrado");
		  System.out.println(c1.area());
		  System.out.println(c1.perimetro());
		  System.out.println(c1.volumen());
		  //Resultado de circulo
		  System.out.println("Resultado de la circunferencia");
		  System.out.println(o1.area());
		  System.out.println(o1.perimetro());
		  System.out.println(o1.volumen());
		  //Resultado Hexagono
		  System.out.println("Resutado del hexagono");
		  System.out.println(h1.area());
		  System.out.println(h1.perimetro());
		  System.out.println(h1.volumen());
	}
	
}
