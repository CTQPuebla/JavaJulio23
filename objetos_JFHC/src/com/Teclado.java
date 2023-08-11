package com;

public class Teclado {
	
	String idioma, tipo, color;
	Boolean retroiluminado;
	
	public Teclado() {
		
	}

	public Teclado(String idioma, String tipo, String color, Boolean retroiluminado) {
		super();
		this.idioma = idioma;
		this.tipo = tipo;
		this.color = color;
		this.retroiluminado = retroiluminado;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Boolean getRetroiluminado() {
		return retroiluminado;
	}

	public void setRetroiluminado(Boolean retroiluminado) {
		this.retroiluminado = retroiluminado;
	}

	@Override
	public String toString() {
		return "Teclado [idioma=" + idioma + ", tipo=" + tipo + ", color=" + color + ", retroiluminado="
				+ retroiluminado + "]";
	}
	

}
