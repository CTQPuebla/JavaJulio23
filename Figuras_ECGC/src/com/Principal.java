package com;

public class Principal {
 
 public static void main(String[] args) {
     
	 Cuadrado cu = new Cuadrado();
     Cuadrado cu2 = new Cuadrado(5);
     Circulo ci = new Circulo(9);
     Hexagono Hx = new Hexagono(3, 6, 9);
     
     
     System.out.println("Cuadrado");
  System.out.println("Area: "+cu2.area());
  System.out.println("Perimetro: "+cu2.perimetro() );
  System.out.println("Volumen: "+ cu2.volumen());
  
  
  System.out.println("Circulo");
  System.out.println("Area: "+ci.area());
  System.out.println("Perimetro: "+ci.perimetro() );
  System.out.println("Volumen: "+ ci.volumen());
  
  
  System.out.println("Hexagono");
  System.out.println("Area: "+cu2.area());
  System.out.println("Perimetro: "+cu2.perimetro() );
  System.out.println("Volumen: "+ cu2.volumen());
 }
}