package com;

public class Principal {
	public static void main(String[] args) {
     
		
		
		Persona p=new Persona("Cristhian", "Masculino", "70.0 kg");
		p.setPeso("85");
	    System.out.println(Persona.ALTURA_MAX);
		System.out.println(p);
		Empleado e=new Empleado();
		e.hacerAlgo();
		
	}
}
