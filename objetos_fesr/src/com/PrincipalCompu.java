package com;

public class PrincipalCompu {
	public static void main(String[] args) {
		String m = "probando";
		Compu a1 = new Compu();
		Procesador procesador1 = new Procesador (16,8,"32MB","AMD Ryzen","Boxed Processor");
		String[] perifericos = {"mouse","teclado","bocinas","camara","microfono"};
		
		Compu a2 = new Compu("PC","16","Windows","Alta",perifericos,procesador1);
		System.out.println(a2);
		
		
		
		
	}
	

}
