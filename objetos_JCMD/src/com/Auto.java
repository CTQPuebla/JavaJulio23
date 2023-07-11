package com;

import java.util.Arrays;

//composicion
public class Auto {
	String modelo;
	String Marca;
	String Color;
	String gama;
	
	
	Motor motor;//atributo objeto
	String[] interiores;
	
	public Auto() {
		
	}

	public Auto(String modelo, String marca, String color, String gama, Motor motor, String[] interiores) {
		super();
		this.modelo = modelo;
		Marca = marca;
		Color = color;
		this.gama = gama;
		this.motor = motor;
		this.interiores = interiores;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getGama() {
		return gama;
	}

	public void setGama(String gama) {
		this.gama = gama;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public String[] getInteriores() {
		return interiores;
	}

	public void setInteriores(String[] interiores) {
		this.interiores = interiores;
	}

	@Override
	public String toString() {
		return "Auto [modelo=" + modelo + ", Marca=" + Marca + ", Color=" + Color + ", gama=" + gama + ", motor="
				+ motor + ", interiores=" + Arrays.toString(interiores) + "]";
	}
	
	

}
