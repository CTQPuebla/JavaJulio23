package com;

public class Principal {
	
	public static void main(String[] args) {
		
		Persona p = new Persona("Laura", "Femenino", "70.5 kg", "1.65");
		p.setPeso("75.0");
		
		System.out.println(p);
		
		Empleado e = new Empleado();
		
		
		/*
		 * Encapsulamiento
		 * Modificadores de acceso:
		 * private, protected, public
		 */
		
		
	}

}


//una herencia no es vidireccional (solo va en una direccion de abajo hacia 
//arriba) ya que el padre no puede heredar del hijo o el padre no puede acceder
//a los atributos del hijo.
//