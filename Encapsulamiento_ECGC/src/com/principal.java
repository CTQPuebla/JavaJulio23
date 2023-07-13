package com;

public class principal {

	public static void main(String[] args ) {
	
		ClaseA a =new ClaseA();
		ClaseA b =new ClaseA();
		ClaseA c =new ClaseA();
		
		System.out.println(a.atributoA);
		System.out.println(b.atributoA);
		System.out.println(c.atributoA);

		ClaseA.atributoA= "otro valor";
		
		System.out.println(a.atributoA);
		System.out.println(b.atributoA);
		System.out.println(c.atributoA);

		
		
	}
}
