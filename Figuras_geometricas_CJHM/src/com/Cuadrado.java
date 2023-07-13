package com;

public class Cuadrado extends Figuras_geometricas implements Calculo {
      
	 double lado;
	 
	 public Cuadrado() {
		 
	 }
	 
	 
	 
	
	public Cuadrado(double lado) {
		
		this.lado = lado;
	}




	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}




	public double getLado() {
		return lado;
	}




	public void setLado(double lado) {
		this.lado = lado;
	}




	@Override
	public double area(double num) {
		// TODO Auto-generated method stub
		return lado*lado;
	}

	@Override
	public double perimetro(double lado) {
		// TODO Auto-generated method stub
		return lado*4;
	}

	@Override
	public double volumen(double lado) {
		// TODO Auto-generated method stub
		return Math.pow(lado, 3);
	}
	
	
	
//	public double area() {
//		// TODO Auto-generated method stub
//		return lado*lado;
//	}

}
