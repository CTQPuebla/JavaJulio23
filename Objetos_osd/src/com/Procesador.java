package com;

public class Procesador {
	
	String tipo; //Intel o AMD
	String frecdreloj;  //se mide en Mhz o Ghz
	int numnucleos;  //desde 2 hasta 64
	String zocalo; //LGA 1200, AM4
	int numhilos;  //
	String memcache; //L1, L2, L3
	
	
	
	public Procesador() {
		
	}

	public Procesador(String tipo, String frecdreloj, int numnucleos, String zocalo, int numhilos, String memcache) {
		super();
		this.tipo = tipo;
		this.frecdreloj = frecdreloj;
		this.numnucleos = numnucleos;
		this.zocalo = zocalo;
		this.numhilos = numhilos;
		this.memcache = memcache;
	}

	
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFrecdreloj() {
		return frecdreloj;
	}

	public void setFrecdreloj(String frecdreloj) {
		this.frecdreloj = frecdreloj;
	}

	public int getNumnucleos() {
		return numnucleos;
	}

	public void setNumnucleos(int numnucleos) {
		this.numnucleos = numnucleos;
	}

	public String getZocalo() {
		return zocalo;
	}

	public void setZocalo(String zocalo) {
		this.zocalo = zocalo;
	}

	public int getNumhilos() {
		return numhilos;
	}

	public void setNumhilos(int numhilos) {
		this.numhilos = numhilos;
	}

	public String getMemcache() {
		return memcache;
	}

	public void setMemcache(String memcache) {
		this.memcache = memcache;
	}

	
	
	@Override
	public String toString() {
		return "Procesador [tipo=" + tipo + ", frecdreloj=" + frecdreloj + ", numnucleos=" + numnucleos + ", zocalo="
				+ zocalo + ", numhilos=" + numhilos + ", memcache=" + memcache + "]";
	}
	

}
