package com;

public class Principal {
	
	public static void main(String[] args) {
		
		Circulo ci=new Circulo();
		ci.setRadio(6);
		System.out.println("El area es: "+ ci.area(0)+" El perimetro es: "+ ci.perimetro(0)+ " El volumen es: "+ ci.volumen(0));
		Cuadrado cu=new Cuadrado();
		cu.setLado(5);
		System.out.println("El area es: "+ cu.area(0)+" El perimetro es: "+ cu.perimetro(0)+ " El volumen es: "+ cu.volumen(0));
		
		
		Hexagono hex= new Hexagono();
		
		hex.setH(6);
		hex.setLado(6);
		hex.setLongitud(6);
		System.out.println("El area es: "+ hex.area(0)+" El perimetro es: "+ hex.perimetro(0)+ " El volumen es: "+ hex.volumen(0));
		
		
		
		
		
		
	}

}
