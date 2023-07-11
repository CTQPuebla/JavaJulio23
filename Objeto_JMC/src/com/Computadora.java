package com;

public class Computadora {
	
	
	String modelo;
	String sistema;
	String discoduro;
	String pantalla;
	String memoriaram;
	String procesador;
	Caracteristicas caracteristicas;
	
	
	public Computadora() {
		
	
		
	}


	public Computadora(String modelo, String sistema, String discoduro, String pantalla, String memoriaram,
			String procesador, Caracteristicas caracteristicas) {
		super();
		this.modelo = modelo;
		this.sistema = sistema;
		this.discoduro = discoduro;
		this.pantalla = pantalla;
		this.memoriaram = memoriaram;
		this.procesador = procesador;
		this.caracteristicas = caracteristicas;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getSistema() {
		return sistema;
	}


	public void setSistema(String sistema) {
		this.sistema = sistema;
	}


	public String getDiscoduro() {
		return discoduro;
	}


	public void setDiscoduro(String discoduro) {
		this.discoduro = discoduro;
	}


	public String getPantalla() {
		return pantalla;
	}


	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}


	public String getMemoriaram() {
		return memoriaram;
	}


	public void setMemoriaram(String memoriaram) {
		this.memoriaram = memoriaram;
	}


	public String getProcesador() {
		return procesador;
	}


	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}


	public Caracteristicas getCaracteristicas() {
		return caracteristicas;
	}


	public void setCaracteristicas(Caracteristicas caracteristicas) {
		this.caracteristicas = caracteristicas;
	}


	@Override
	public String toString() {
		return "Computadora [modelo=" + modelo + ", sistema=" + sistema + ", discoduro=" + discoduro + ", pantalla="
				+ pantalla + ", memoriaram=" + memoriaram + ", procesador=" + procesador + ", caracteristicas="
				+ caracteristicas + "]";
	}
		

}//fin de clases
