package com;

public class Empleado extends Persona {
	
	String rfc;
	String nss;
	Double salario;
	String horario;
	public static String AtributoA= "HOLA";
	
	public Empleado() {
		
	}

	public Empleado(String nombre, String sexo, String peso, String altura, String rfc, String nss, Double salario,
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

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
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
		return "Empleado [rfc=" + rfc + ", nss=" + nss + ", salario=" + salario + ", horario=" + horario + "]";
	}
public void otroMetodo() {
	System.out.println("Hasta que no vean carne, mejor coman normal...");
}
	

}
