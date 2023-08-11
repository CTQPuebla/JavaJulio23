package com;

public class Principal {
	public static void main(String[] args) {
           
		
		
		Circulo ci=new Circulo();
	    ci.setRadio(6);
	    
	    System.out.println("EL area es del circulo es:"+ ci.area()+ " Perimetro " +  ci.perimetro(0) + " Volumen " + ci.volumen(0));
	    
	    Cuadrado cu=new Cuadrado();
	    cu.setLado(5);
	    System.out.println("EL area del cuadrado es:"+ cu.area(0)+ " Perimetro " + cu.perimetro(5)+ " Volumen " + cu.volumen(4));
	    
	    Hexagono he= new Hexagono();
	    he.setLado(6);
	    he.setLargo(6);
	    he.setLongitud(6);
	    System.out.println("El area del hexagono es:"+ he.area()+ " Perimetro " + he.perimetro() + " Volumen " + he.volumen() );
	    
	}
}
