package com;

public class Pantalla {
int Pixeles;
int tama�o;
String tipo;
public Pantalla(int pixeles, int tama�o, String tipo) {
	super();
	Pixeles = pixeles;
	this.tama�o = tama�o;
	this.tipo = tipo;
}
public int getPixeles() {
	return Pixeles;
}
public void setPixeles(int pixeles) {
	Pixeles = pixeles;
}
public int getTama�o() {
	return tama�o;
}
public void setTama�o(int tama�o) {
	this.tama�o = tama�o;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
@Override
public String toString() {
	return "Pantalla [Pixeles=" + Pixeles + ", tama�o=" + tama�o + ", tipo=" + tipo + "]";
}

}
