package com;

public class FigurasGeometricas  {
public static void main(String[] args) {
	
	String nombre;
	
    System.out.println("RESULTADOS DEL CUADRAD0: ");
	Cuadrado c1 = new Cuadrado(10);
	System.out.println("Su área es:" + c1.area());
	System.out.println("Su perimetro: " + c1.perimetro());
	System.out.println("Su volumen es: " + c1.volumen());
	
	System.out.println("\nRESULTADO DE CIRCULO: ");
	Circulo Cir1 = new Circulo(25);
	System.out.println("El área es: " + Cir1.area());
	System.out.println("El perimetro es: " + Cir1.perimetro());
	System.out.println("El volumen es : " + Cir1.volumen());
	
	System.out.println("\nRESULTADO DE TRIANGULO");
	Triangulo Tr = new Triangulo(8,20,12);
	System.out.println("El área es: " + Tr.area());
	System.out.println("El perimetro es: " + Tr.perimetro());
	System.out.println("El volumen es: " + Tr.volumen());
	
	
}
}
