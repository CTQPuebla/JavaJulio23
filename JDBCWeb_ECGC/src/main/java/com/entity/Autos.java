package com.entity;

public class Autos {

	private int modeloId;
	private String modelo;
	private int año;
	private String tipo;
	private int marcaId;
	public Autos() {}
	public Autos(int modeloId, String modelo, int año, String tipo, int marcaId) {
		
		this.modeloId = modeloId;
		this.modelo = modelo;
		this.año = año;
		this.tipo = tipo;
		this.marcaId = marcaId;
	}
	public int getModeloId() {
		return modeloId;
	}
	public void setModeloId(int modeloId) {
		this.modeloId = modeloId;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getMarcaId() {
		return marcaId;
	}
	public void setMarcaId(int marcaId) {
		this.marcaId = marcaId;
	}
	@Override
	public String toString() {
		return "Autos [modeloId=" + modeloId + ", modelo=" + modelo + ", año=" + año + ", tipo=" + tipo + ", marcaId="
				+ marcaId + "]";
	}
	
	
	
}
