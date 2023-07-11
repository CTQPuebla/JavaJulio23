package com;

public class Procesador {
	int numeroHilos;
	int numeroNucleos;
	String Cache;
	String marca;
	String plataforma;

	public Procesador() {

	}

	public Procesador(int numeroHilos, int numeroNucleos, String cache, String marca, String plataforma) {
		super();
		this.numeroHilos = numeroHilos;
		this.numeroNucleos = numeroNucleos;
		Cache = cache;
		this.marca = marca;
		this.plataforma = plataforma;
	}

	public int getNumeroHilos() {
		return numeroHilos;
	}

	public void setNumeroHilos(int numeroHilos) {
		this.numeroHilos = numeroHilos;
	}

	public int getNumeroNucleos() {
		return numeroNucleos;
	}

	public void setNumeroNucleos(int numeroNucleos) {
		this.numeroNucleos = numeroNucleos;
	}

	public String getCache() {
		return Cache;
	}

	public void setCache(String cache) {
		Cache = cache;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	@Override
	public String toString() {
		return "Procesador [numeroHilos=" + numeroHilos + ", numeroNucleos=" + numeroNucleos + ", Cache=" + Cache
				+ ", marca=" + marca + ", plataforma=" + plataforma + "]";
	}

}
