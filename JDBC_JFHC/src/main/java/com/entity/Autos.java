package com.entity;


//POJO
//PLAIN OLD JAVA PROJECTS

public class Autos {
	
	
	private int modeloid;	
	private String modelo;
	private int año;
	private String tipo;
	private int marcaid;
	
	public Autos()
	{
		
	}

	public Autos(int modeloid, String modelo, int año, String tipo, int marcaid) {
		super();
		this.modeloid = modeloid;
		this.modelo = modelo;
		this.año = año;
		this.tipo = tipo;
		this.marcaid = marcaid;
	}

	public int getModeloid() {
		return modeloid;
	}

	public void setModeloid(int modeloid) {
		this.modeloid = modeloid;
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

	public int getMarcaid() {
		return marcaid;
	}

	public void setMarcaid(int marcaid) {
		this.marcaid = marcaid;
	}

	@Override
	public String toString() {
		return "Autos [modeloid=" + modeloid + ", modelo=" + modelo + ", año=" + año + ", tipo=" + tipo + ", marcaid="
				+ marcaid + "]";
	}
	

}


