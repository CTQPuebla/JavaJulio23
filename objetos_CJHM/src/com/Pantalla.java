package com;

public class Pantalla {
String tama�o,tipo;
double calidad;



public Pantalla() {
	
}



public Pantalla(String tama�o, String tipo, double calidad) {
	super();
	this.tama�o = tama�o;
	this.tipo = tipo;
	this.calidad = calidad;
}



public String getTama�o() {
	return tama�o;
}



public void setTama�o(String tama�o) {
	this.tama�o = tama�o;
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
	return "Pantalla [tama�o=" + tama�o + ", tipo=" + tipo + ", calidad=" + calidad + "]";
}

}
