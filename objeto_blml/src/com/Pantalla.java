package com;

public class Pantalla {
int Pixeles;
int tamaño;
String tipo;
public Pantalla(int pixeles, int tamaño, String tipo) {
	super();
	Pixeles = pixeles;
	this.tamaño = tamaño;
	this.tipo = tipo;
}
public int getPixeles() {
	return Pixeles;
}
public void setPixeles(int pixeles) {
	Pixeles = pixeles;
}
public int getTamaño() {
	return tamaño;
}
public void setTamaño(int tamaño) {
	this.tamaño = tamaño;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
@Override
public String toString() {
	return "Pantalla [Pixeles=" + Pixeles + ", tamaño=" + tamaño + ", tipo=" + tipo + "]";
}

}
