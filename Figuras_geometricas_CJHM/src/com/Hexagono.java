package com;

public class Hexagono extends Figuras_geometricas implements Calculo {
	double lado;
	double longitud;
	double largo;
	//double apotema= longitud*.05*Math.sqrt(3);
	
	
	public Hexagono() {
		
	}
	
	

	
	public Hexagono(double lado, double longitud, double largo, double apotema) {
		super();
		this.lado = lado;
		this.longitud = longitud;
		this.largo = largo;
		//this.apotema = apotema;
	}




	public double getLado() {
		return lado;
	}




	public void setLado(double lado) {
		this.lado = lado;
	}




	public double getLongitud() {
		return longitud;
	}




	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}




	public double getLargo() {
		return largo;
	}




	public void setLargo(double largo) {
		this.largo = largo;
	}




//	public double getApotema() {
//		return apotema;
//	}
//
//
//
//
//	public void setApotema(double apotema) {
//		this.apotema = apotema;
//	}




	@Override
	public String toString() {
		return "Hexagono [lado=" + lado + ", longitud=" + longitud + ", largo=" + largo + ", apotema=" + "]";
	}




	@Override
	public double area(double num) {
		// TODO Auto-generated method stub
		return this.perimetro(lado)*(longitud/2*Math.sqrt(3))/2;
	}

	@Override
	public double perimetro(double lado) {
		// TODO Auto-generated method stub
		return lado*6;
	}

	@Override
	public double volumen(double lado) {
		// TODO Auto-generated method stub
		return 3*lado*(longitud/2*Math.sqrt(3))*largo;
	}
	
	
	public double area() {
		// TODO Auto-generated method stub
		return this.perimetro(lado)*(longitud/2*Math.sqrt(3))/2;
	}
	
	public double volumen() {
		// TODO Auto-generated method stub
		return 3*lado*(longitud/2*Math.sqrt(3))*largo;
	}
	
	public double perimetro() {
		// TODO Auto-generated method stub
		return lado*6;
	}
	

}
