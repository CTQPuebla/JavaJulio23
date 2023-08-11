package com;

public class TarjetaGrafica {
	String gpu;
	int memoria;
	String vrm; // desde 6 hasta 16 pines
	
	public TarjetaGrafica() {
		
	}

	public TarjetaGrafica(String gpu, int memoria, String vrm) {
		super();
		this.gpu = gpu;
		this.memoria = memoria;
		this.vrm = vrm;
	}

	public String getGpu() {
		return gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public String getVrm() {
		return vrm;
	}

	public void setVrm(String vrm) {
		this.vrm = vrm;
	}

	@Override
	public String toString() {
		return "TarjetaGrafica [gpu=" + gpu + ", memoria=" + memoria + ", vrm=" + vrm + "]";
	}
	
	
	

}
