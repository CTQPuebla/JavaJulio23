package com;

public class FiguraGeometrica {
	
	String nombre;
	
	
	//CONSTRUCTOR VACIO
	public FiguraGeometrica() {
		
	}


    //CONSTRUCTOR 
	public FiguraGeometrica(String nombre) {
		this.nombre = nombre;
	}


    //SETTERS AND GETTERS
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


    //toString
	@Override
	public String toString() {
		return "FiguraGeometrica [nombre=" + nombre + "]";
	}
	
	
//	//METODO ABSTRACTO
//	//CUADRADO
//	public abstract double areaCua(double area);
//	public abstract double perimetroCua(double lado);
//	public abstract double volumenCua(double volumen);
//	
//	//CIRCULO
//	public abstract double areaCir(double area);
//	public abstract double perimetroCir(double lado);
//	public abstract double volumenCir(double volumen);
//	
//	//HEXAGONO
//	public abstract double areaHex(double area);
//	public abstract double perimetroHex(double lado);
//	public abstract double volumenHex(double volumen);
	
	
	
}
