package com;

public class Principal {
	
	public static void main(String[] args) {
		
//		Cuadrado c1 = new Cuadrado(); //valor que no sabemos
//		System.out.println("El area es:" + c1.area(3));//se le da el valor
		
		Cuadrado c2 = new Cuadrado(5); //valor que ya sabemos
		System.out.println("El perimetro del cuadrado es: " + c2.perimetro() + " su area: " + " y su volumen: " + c2.volumen());
//		System.out.println("El perimero es: " + c2.perimetro());
//		System.out.println("El volumen es: " + c2.volumen());
		
		
		Circulo cir = new Circulo(3);
		System.out.println("El perimetro del circulo: " + cir.perimetro() + " su area: " + cir.area() + " y su volumen: " + cir.volumen());
//		System.out.println("El perimetro del circulo: " + cir.perimetro());
//		System.out.println("El volumen de la esfera: " + cir.volumen());
		
		
		Hexagono hexa = new Hexagono(3, 6, 8);
		System.out.println("El perimetro del hexagono es: " + hexa.perimetro() + " su area: " + hexa.area() + " y su volumen: " + hexa.volumen());
	}

}
