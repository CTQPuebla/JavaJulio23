package com;

public class Principal {
	public static void main(String[] args) {
		
		Cuadrado c1 = new Cuadrado();
		Cuadrado c2= new Cuadrado(5);
		
		
//		System.out.println(c2.area());
//		System.out.println(c2.permietro());
//		System.out.println(c2.volumen());
		System.out.println("el area del cuadrado es :"+ c2.area()+" ,el perimetro es :"+ c2.permietro() + " ,el volumen es :"+c2.volumen());
		
		Circulo cr1 = new Circulo();
		Circulo cr2 = new Circulo(3);
		
//		System.out.println(cr2.area());
//		System.out.println(cr2.permietro());
		System.out.println("el area del circulo es : "+cr2.area()+ " , el permietro es : "+ cr2.permietro()+" , el volumen es : "+ cr2.volumen());
		
		Hexagono h1 = new Hexagono();
		Hexagono h2 = new Hexagono(3, 7, 10);
		System.out.println("el area del hexagono es :"+ h2.area() + ", el permimetro del hexagono es : "+ h2.permietro() + ", el volumen es :"+h2.volumen());
		
		
	}

}
