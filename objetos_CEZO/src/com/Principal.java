package com;

public class Principal {

	public static void main(String[] args) {
		
//		
//		
//		String m = "balandlskdk sljdls";
//		
//		Audifonos au = new Audifonos();
//		
//		au.setColor("Negro");
//		au.setMarca("Vorago");
//		au.setModelo("HPB-401");
//		au.setTamaño("Grande");
//		au.setTipo("Diadema");
//		au.setConectividad("Bluetooth");
//		au.setBotones(4);
//		au.setFrecuencia(40.4);
//		
//		
//		
//		
//		Audifonos au2 = new Audifonos("Gris", "Sony","MX-4000","Grande","Inalambrico",5, "Bluethoot", 40.4);
//		
		
		
		
		
		
		
//		------------------------------------------------------------------------------------------------------------------
		
		
//		System.out.println(au2);
//		
//		Auto a1 = new Auto(); // Objeto inicializado vacio
//		
//		//a1.setColor(color);
//		
//		
//		
//		Motor motor1 = new Motor("V", "Gasolina", 6, 3.6, 250); 
//		String [] interiores = {" Pantalla touch", "3 filas de asientos", "Clima 6 zonas", "Salidas USB",
//				"Forro en piel", "Quemacocos", "9 bocinas", "cinturones", "10 bolsas aire"};
//		Auto a2 = new Auto("Q7", "Audi", "Negro", "Alta", motor1, interiores);
//
//		System.out.println(a2);
		
		
		
		Procesador pr1 = new Procesador("AMD","RYZEN", 5);
		TarjetaGrafica tg1 = new TarjetaGrafica("Nvidia", 8, "12 pines");
		
		Object[] hrdw = {pr1,tg1};
		
		Computadora compu1 = new Computadora("Lenovo","Negro", "Legion", 2.5, 18.500, hrdw);
		
		System.out.println(compu1);
	}

}
