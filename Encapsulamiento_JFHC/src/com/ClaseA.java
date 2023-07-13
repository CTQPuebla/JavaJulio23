package com;

import java.util.Date;

public class ClaseA {
	
	
	public static String atributoA="Hola";
	protected int atributoB;
	private double atributoC;
	protected Date fecha;
	
	
	
	public String getAtributoA() {
		return atributoA;
	}
	
	//Inhabiltado
//	public void setAtributoA(String atributoA) {
//		this.atributoA = atributoA;
	//}
	public int getAtributoB() {
		return atributoB;
	}
	public void setAtributoB(int atributoB) {
		this.atributoB = atributoB;
	}
	public double getAtributoC() {
		return atributoC;
	}
	public void setAtributoC(double atributoC) {
		this.atributoC = atributoC;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	
	

}
