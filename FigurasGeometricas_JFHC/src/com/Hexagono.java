package com;

public class Hexagono extends FiguraGeometrica implements Calculos {

	double lado;
	double longitud;
	double h;
	
	public Hexagono() {
		
	}
	
	
	public Hexagono(double lado, double longitud, double h) {
		super();
		this.lado = lado;
		this.longitud = longitud;
		this.h = h;
		
	}


	@Override
	public String toString() {
		return "Hexagono [lado=" + lado + ", longitud=" + longitud + ", h=" + h ;
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


	public double getH() {
		return h;
	}


	public void setH(double h) {
		this.h = h;
	}



	
	@Override
	public double area(double a) {
		// TODO Auto-generated method stub
		return this.perimetro(a) * (longitud/2*Math.sqrt(3))/2;
	}

	@Override
	public double perimetro(double b) {
		// TODO Auto-generated method stub
		return lado *6;
	}

	@Override
	public double volumen(double c) {
		// TODO Auto-generated method stub
		return 3*lado*(longitud/2*Math.sqrt(3))*h ;
	}

}
