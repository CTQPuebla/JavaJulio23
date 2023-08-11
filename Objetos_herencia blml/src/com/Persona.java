package com;

public class Persona {
String nombre;
String sexo;
String peso;
String altura;

public Persona (){
	
}

public Persona(String nombre, String sexo, String peso, String altura) {
	super();
	this.nombre = nombre;
	this.sexo = sexo;
	this.peso = peso;
	this.altura = altura;
	
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getSexo() {
	return sexo;
}

public void setSexo(String sexo) {
	this.sexo = sexo;
}

public String getPeso() {
	return peso;
}

public void setPeso(String peso) {
	this.peso = peso;
}

public String getAltura() {
	return altura;
}

public void setAltura(String altura) {
	this.altura = altura;
}

@Override
public String toString() {
	return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + "]";

}
public void hacerAlgo () {
	System.out.println("estoy haciendo algo...");
}

}	

