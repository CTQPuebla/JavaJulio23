package com;

public class Procesador {
int numNucleos;
int numHilos;
String RAM;
double FReloj;
public Procesador(int numNucleos, int numHilos, String rAM, double fReloj) {
	super();
	this.numNucleos = numNucleos;
	this.numHilos = numHilos;
	RAM = rAM;
	FReloj = fReloj;
}
public int getNumNucleos() {
	return numNucleos;
}
public void setNumNucleos(int numNucleos) {
	this.numNucleos = numNucleos;
}
public int getNumHilos() {
	return numHilos;
}
public void setNumHilos(int numHilos) {
	this.numHilos = numHilos;
}
public String getRAM() {
	return RAM;
}
public void setRAM(String rAM) {
	RAM = rAM;
}
public double getFReloj() {
	return FReloj;
}
public void setFReloj(double fReloj) {
	FReloj = fReloj;
}
@Override
public String toString() {
	return "Procesador [numNucleos=" + numNucleos + ", numHilos=" + numHilos + ", RAM=" + RAM + ", FReloj=" + FReloj
			+ "]";
}


}

