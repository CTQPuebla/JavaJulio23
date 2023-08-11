package com;

public abstract class Figuras_geometricas {

	int Numlados;
	int numAng;
	String color;
	String posicion;
	public Figuras_geometricas() {
		
	}
	public Figuras_geometricas(int numlados, int numAng, String color, String posicion) {
		super();
		Numlados = numlados;
		this.numAng = numAng;
		this.color = color;
		this.posicion = posicion;
	}
	public int getNumlados() {
		return Numlados;
	}
	public void setNumlados(int numlados) {
		Numlados = numlados;
	}
	public int getNumAng() {
		return numAng;
	}
	public void setNumAng(int numAng) {
		this.numAng = numAng;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	@Override
	public String toString() {
		return "Figuras_geometricas [Numlados=" + Numlados + ", numAng=" + numAng + ", color=" + color + ", posicion="
				+ posicion + "]";
	}
	public abstract double area (double num);
	public abstract double perimetro (double lado);
	public abstract double volumen (double num);
}

