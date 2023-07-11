package com;

import java.util.Arrays;

public class Computadora {

	String color;
	String marca;
	String modelo;
	String tama�o;
	String tipo;
	String SO;
	
	String [] perifericos;
	Procesador procesador;
	Pantalla pantalla;
	
	
	public Computadora () {
		
	}


	public Computadora(String color, String marca, String modelo, String tama�o, String tipo, String sO,
			String[] perifericos, Procesador procesador, Pantalla pantalla) {
		super();
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.tama�o = tama�o;
		this.tipo = tipo;
		SO = sO;
		this.perifericos = perifericos;
		this.procesador = procesador;
		this.pantalla = pantalla;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
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


	public String getSO() {
		return SO;
	}


	public void setSO(String sO) {
		SO = sO;
	}


	public String[] getPerifericos() {
		return perifericos;
	}


	public void setPerifericos(String[] perifericos) {
		this.perifericos = perifericos;
	}


	public Procesador getProcesador() {
		return procesador;
	}


	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}


	public Pantalla getPantalla() {
		return pantalla;
	}


	public void setPantalla(Pantalla pantalla) {
		this.pantalla = pantalla;
	}


	@Override
	public String toString() {
		return "Computadora [color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", tama�o=" + tama�o
				+ ", tipo=" + tipo + ", SO=" + SO + ", perifericos=" + Arrays.toString(perifericos) + ", procesador="
				+ procesador + ", pantalla=" + pantalla + "]";
	}

}
