package com;

public class Principal {

	public static void main(String[] args) {
		

		  Cuadrado c1 = new Cuadrado();
		  Cuadrado c2 = new Cuadrado(5);
		  
		  
		  System.out.println("Perimetro Cuadrado uno "+ c1.perimetro1(5));
		  System.out.println("Perimetro Cuadrado dos "+c2.perimetro2());
		  System.out.println("Area Cuadrado uno "+ c1.area(5));
		  System.out.println("Area Cuadrado dos "+c2.area());  
		  System.out.println("Volumen Cubo "+c2.volumen());
		  c1.setLado(5);
		  System.out.println("Volumen Cubo "+c1.volumen());
		  
		  
		  
		  
		  
		  
		  System.out.println("\n\n");
		  
		  Circulo cir1 = new Circulo();
		  Circulo cir2 = new Circulo(9);
		  
		  
		  System.out.println("Perimetro Circulo uno "+ cir1.perimetro1(9));
		  System.out.println("Perimetro Circulo dos "+cir2.perimetro2());
		  System.out.println("Area Circulo uno "+ cir1.area(9));
		  System.out.println("Area Circulo dos "+cir2.area());  
		  System.out.println("Volumen esfera "+cir2.volumen());
		  
		  
		  
		  System.out.println("\n\n");
		  
		  Hexagono Hex1 = new Hexagono();
		  Hexagono Hex2 = new Hexagono(3, 6, 9);
		  
		  Hex1.setApotema(1);
		  
		  System.out.println("Perimetro Hexagono uno "+ Hex1.perimetro1(6));
		  System.out.println("Perimetro Hexagono dos "+Hex2.perimetro2());
		  System.out.println("Area Hexagono uno "+ Hex1.area(6));
		  System.out.println("Area Hexagono dos "+ Hex2.area());
		  System.out.println("Volumen prisma Hexagonal "+ Hex2.volumen());
		  
		  
		  
		  
		  
	}

}
