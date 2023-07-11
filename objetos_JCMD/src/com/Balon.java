package com;

public class Balon {
	String color;
	String marca;
	int tama�o;
	String material;
	String deporte;
	double precio;
	
	public Balon() {
		
	}

	public Balon(String color, String marca, int tama�o, String material, String deporte, double precio) {
		super();
		this.color = color;
		this.marca = marca;
		this.tama�o = tama�o;
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

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
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
		return "Balon [color=" + color + ", marca=" + marca + ", tama�o=" + tama�o + ", material=" + material
				+ ", deporte=" + deporte + ", precio=" + precio + "]";
	}
	
	
	
	
	
	
	

}
