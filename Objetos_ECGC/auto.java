package com;

import java.util.Arrays;

public class auto {
	
	
	String modelo;
	String marca;
	String color;
	String gama;
	motor motorr;   //atributo objeto
	String[] interior;
	 
	
	public auto(){
		
	}


	public auto(String modelo, String marca, String color, String gama, motor motorr, String[] interior) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.color = color;
		this.gama = gama;
		this.motorr = motorr;
		this.interior = interior;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getGama() {
		return gama;
	}


	public void setGama(String gama) {
		this.gama = gama;
	}


	public motor getMotorr() {
		return motorr;
	}


	public void setMotorr(motor motorr) {
		this.motorr = motorr;
	}


	public String[] getInterior() {
		return interior;
	}


	public void setInterior(String[] interior) {
		this.interior = interior;
	}


	@Override
	public String toString() {
		return "auto [modelo=" + modelo + ", marca=" + marca + ", color=" + color + ", gama=" + gama + ", motorr="
				+ motorr + ", interior=" + Arrays.toString(interior) + "]";
	}


}