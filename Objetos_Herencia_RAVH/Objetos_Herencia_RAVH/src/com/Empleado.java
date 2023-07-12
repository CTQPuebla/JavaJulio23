package com;

public class Empleado extends Persona {
	
	String rfc,nss,horario;
	double salario;

	public Empleado() {
		
	}

	public Empleado(String nombre, String sexo, String peso, String altura, String rfc, String nss, String horario,
			double salario) {
		super(nombre, sexo, peso, altura);
		this.rfc = rfc;
		this.nss = nss;
		this.horario = horario;
		this.salario = salario;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getNss() {
		return nss;
	}

	public void setNss(String nss) {
		this.nss = nss;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [rfc=" + rfc + ", nss=" + nss + ", horario=" + horario + ", salario=" + salario + "]";
	}
	
	
	
	public void otroMetodo() {
		System.out.println("Hasta que no vea carne, mejor coman normal");
	}
	
	
	
	
}
