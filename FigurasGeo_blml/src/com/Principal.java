package com;

public class Principal {


public static void main(String[] args) {
	
	Cuadrado c1= new Cuadrado (5);
	System.out.println("El area del cuadrado es:"+c1.area());
	System.out.println("El perimetro del cuadrado es:"+ c1.perimetro());
	System.out.println("El volumen del cuadrado es:"+ c1.volumen());
	
	Circulo ci1= new Circulo (3);
	System.out.println("El área del circulo es:"+ ci1.area());
}
}
