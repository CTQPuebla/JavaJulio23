package com;

public class Balon {
	String color;
	String marca;
	int tamaño;
	String material;
	String deporte;
	double precio;
	
	public Balon() {
		
	}

	public Balon(String color, String marca, int tamaño, String material, String deporte, double precio) {
		super();
		this.color = color;
		this.marca = marca;
		this.tamaño = tamaño;
		this.material = material;
		this.deporte = deporte;
		this.precio = precio;
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

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Balon [color=" + color + ", marca=" + marca + ", tamaño=" + tamaño + ", material=" + material
				+ ", deporte=" + deporte + ", precio=" + precio + "]";
	}
	
	
	
	
	
	
	

}
