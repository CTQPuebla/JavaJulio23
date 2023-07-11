package com;

public class Bateria {
	
	String marca, color;
    double duracion;
    int voltaje;
    
    public Bateria() {
    	
    }

	public Bateria(String marca, String color, double duracion, int voltaje) {
		super();
		this.marca = marca;
		this.color = color;
		this.duracion = duracion;
		this.voltaje = voltaje;
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

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public int getVoltaje() {
		return voltaje;
	}

	public void setVoltaje(int voltaje) {
		this.voltaje = voltaje;
	}

	@Override
	public String toString() {
		return "Bateria [marca=" + marca + ", color=" + color + ", duracion=" + duracion + ", voltaje=" + voltaje + "]";
	}
    
    

}
