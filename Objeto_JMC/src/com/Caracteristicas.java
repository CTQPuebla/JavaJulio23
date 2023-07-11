package com;

public class Caracteristicas {
	String modelo;
	String procesador;
	String tarjetagrafica;
	
public Caracteristicas() {
	
}

public Caracteristicas(String modelo, String procesador, String tarjetagrafica) {
	super();
	this.modelo = modelo;
	this.procesador = procesador;
	this.tarjetagrafica = tarjetagrafica;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public String getProcesador() {
	return procesador;
}

public void setProcesador(String procesador) {
	this.procesador = procesador;
}

public String getTarjetagrafica() {
	return tarjetagrafica;
}

public void setTarjetagrafica(String tarjetagrafica) {
	this.tarjetagrafica = tarjetagrafica;
}

@Override
public String toString() {
	return "Caracteristicas [modelo=" + modelo + ", procesador=" + procesador + ", tarjetagrafica=" + tarjetagrafica
			+ "]";
}


	
}

	

