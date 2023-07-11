package com;

public class Software {
	
	String so, antivirus, navegador, paquetería, controlRemoto;
   int vigenciaSO, vigenciaA, vigenciaN, vigenciaP, vigenciaCR;
   
   public Software() {
	   
   }

   //METODO CONSTRUCTORES
public Software(String so, String antivirus, String navegador, String paquetería, String controlRemoto, int vigenciaSO,
		int vigenciaA, int vigenciaN, int vigenciaP, int vigenciaCR) {
	
	this.so = so;
	this.antivirus = antivirus;
	this.navegador = navegador;
	this.paquetería = paquetería;
	this.controlRemoto = controlRemoto;
	this.vigenciaSO = vigenciaSO;
	this.vigenciaA = vigenciaA;
	this.vigenciaN = vigenciaN;
	this.vigenciaP = vigenciaP;
	this.vigenciaCR = vigenciaCR;
	
	
	
	
}

//METODO GET-SET PARA AGREGAR VALORES A ATRIBUTOS

public String getSO() {
	return so;
}

public void setSO(String so) {
	this.so = so;
}

public String getAntivirus() {
	return antivirus;
}

public void setAntivirus(String antivirus) {
	this.antivirus = antivirus;
}

public String getNavegador() {
	return navegador;
}

public void setNavegador(String navegador) {
	this.navegador = navegador;
}

public String getPaquetería() {
	return paquetería;
}

public void setPaquetería(String paquetería) {
	this.paquetería = paquetería;
}

public String getControlRemoto() {
	return controlRemoto;
}

public void setControlRemoto(String controlRemoto) {
	this.controlRemoto = controlRemoto;
}

public int getVigenciaSO() {
	return vigenciaSO;
}

public void setVigenciaSO(int vigenciaSO) {
	this.vigenciaSO = vigenciaSO;
}

public int getVigenciaA() {
	return vigenciaA;
}

public void setVigenciaA(int vigenciaA) {
	this.vigenciaA = vigenciaA;
}

public int getVigenciaN() {
	return vigenciaN;
}

public void setVigenciaN(int vigenciaN) {
	this.vigenciaN = vigenciaN;
}

public int getVigenciaP() {
	return vigenciaP;
}

public void setVigenciaP(int vigenciaP) {
	this.vigenciaP = vigenciaP;
}

public int getVigenciaCR() {
	return vigenciaCR;
}

public void setVigenciaCR(int vigenciaCR) {
	this.vigenciaCR = vigenciaCR;
}


//METODO TO STRING
@Override
public String toString() {
	return "Software [so=" + so + ", antivirus=" + antivirus + ", navegador=" + navegador + ", paquetería=" + paquetería
			+ ", controlRemoto=" + controlRemoto + ", vigenciaSO=" + vigenciaSO + ", vigenciaA=" + vigenciaA
			+ ", vigenciaN=" + vigenciaN + ", vigenciaP=" + vigenciaP + ", vigenciaCR=" + vigenciaCR + "]";
}
   



   
   
}
