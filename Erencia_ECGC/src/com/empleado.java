package com;

public class empleado extends persona{
	
	String rfc;
	String nss;
	double salario;
	String horario;
	
	
	public empleado() {
		
	}


	public empleado(String nombre, String sexo, String peso, String altura, String rfc, String nss, double salario,
			String horario) {
		super(nombre, sexo, peso, altura);
		this.rfc = rfc;
		this.nss = nss;
		this.salario = salario;
		this.horario = horario;
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


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public String getHorario() {
		return horario;
	}


	public void setHorario(String horario) {
		this.horario = horario;
	}


	@Override
	public String toString() {
		return "empleado [rfc=" + rfc + ", nss=" + nss + ", salario=" + salario + ", horario=" + horario + "]";
	}
	
	public void otroMetodo() {
		System.out.println("hasta que no vean carne, coman normal");
	}
	
	
	
	
}
