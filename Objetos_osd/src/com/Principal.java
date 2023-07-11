package com;

public class Principal {
	
	public static void main(String[] args) {
		
		Procesador procesador = new Procesador("Intel Care i5", "100Mhz", 24, "LGA 1200", 6, "L3");
		Pantalla pantalla = new Pantalla("LED", 15.5, "1090*1080");
		
		String[] caract = {"Teclado RGB","Camara HD","RAM 8","Tipo C","2 Puertos USB"};
		
		Laptop lap = new Laptop("Lenovo", "Azul", "1 Tera", caract, pantalla, procesador);
		System.out.println(lap);
	}

}
