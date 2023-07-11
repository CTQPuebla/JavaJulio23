package com;

import java.util.Arrays;

public class Compu {
	String tipo;
	String memoriaRam;
	String sistemaOperativo;
	String gama;
	String[] perifericos;
	Procesador procesador;

	public Compu() {

	}

	public Compu(String tipo, String memoriaRam, String sistemaOperativo, String gama, String[] perifericos,
			Procesador procesador) {
		super();
		this.tipo = tipo;
		this.memoriaRam = memoriaRam;
		this.sistemaOperativo = sistemaOperativo;
		this.gama = gama;
		this.perifericos = perifericos;
		this.procesador = procesador;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMemoriaRam() {
		return memoriaRam;
	}

	public void setMemoriaRam(String memoriaRam) {
		this.memoriaRam = memoriaRam;
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public String getGama() {
		return gama;
	}

	public void setGama(String gama) {
		this.gama = gama;
	}

	public String[] getPerifericos() {
		return perifericos;
	}

	public void setPerifericos(String[] perifericos) {
		this.perifericos = perifericos;
	}

	public Procesador getProcesador() {
		return procesador;
	}

	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}

	@Override
	public String toString() {
		return "Compu [tipo=" + tipo + ", sistemaOperativo=" + sistemaOperativo + ", gama=" + gama + ", perifericos="
				+ Arrays.toString(perifericos) + ", procesador=" + procesador + "]";
	}

}
