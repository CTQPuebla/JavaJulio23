package com;

public class Pantalla {
String tamaño,tipo;
double calidad;



public Pantalla() {
	
}



public Pantalla(String tamaño, String tipo, double calidad) {
	super();
	this.tamaño = tamaño;
	this.tipo = tipo;
	this.calidad = calidad;
}



public String getTamaño() {
	return tamaño;
}



public void setTamaño(String tamaño) {
	this.tamaño = tamaño;
}



public String getTipo() {
	return tipo;
}



public void setTipo(String tipo) {
	this.tipo = tipo;
}



public double getCalidad() {
	return calidad;
}



public void setCalidad(double calidad) {
	this.calidad = calidad;
}



@Override
public String toString() {
	return "Pantalla [tamaño=" + tamaño + ", tipo=" + tipo + ", calidad=" + calidad + "]";
}

}
