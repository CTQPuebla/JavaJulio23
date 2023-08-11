package com;

public class Principal {
	
      public static void main(String[] args) {
    	  
//    	  String m = "iiuytree";
//    			  
//    		Audifonos au =new Audifonos	();//constructores vacios
//    		
//    		au.setColor("Negro");
//    		au.setMarca("vorago");
//    		au.setModelo("HPB-401");
//    		au.setTamaño("Grande");
//    		au.setTipo("Diadema");
//    		au.setConectividad("Bluetooth");
//    		au.setFrecuencia(40.0);
//    		au.setBotones(4);
//    		
//    		Audifonos au2= new Audifonos("Gris", "sony", "MX-4000", "grande", "Inalambrico", "Bluetooth",5, 40.0);
//    		//Constructor lleno
//    		System.out.println(au2);
//    		
//    		//Practica celular
//    		Celular ce = new Celular ();
//    		ce.setColor("Blanco");
//    		ce.setMarca("Sony");
//    		ce.setModelo("W-200");
//    		ce.setDimensiones(4.6);
//    		ce.setBotones(3);
//    		
//    		
//    		System.out.println(ce);
//    		
//    		
//    		Celular cel= new Celular("negro", "Motorola", "G9 power", 5.1, 4);    	
//    		System.out.println(cel);
    	  
//    	  
//    	  Auto a1= new Auto();//Objeto inicializado vacio
//    	  
//    	  Motor motor1= new Motor("V", "Gasolina", 6, 3.6, 250);
//    	  String[] interiores = {"Pantalla", "3 filas de asientos", "Clima 6 zonas", "Salidas USB",
//    			  "Forro de piel", "Quemacocos", "9 Bocinas","cinturones", "10 bolsas de aire"};
//    	
//    	  
//    	  Auto a2= new Auto("Q7", "Audi", "Negro", "Alta", motor1, interiores);
//  		
//    	  System.out.println(a2);
    	
    	  Laptop lap= new Laptop();
    	  Microprocesador micro = new Microprocesador("Intel", "I5", 8, 4.5);
    	  Teclado te= new Teclado("Español","Alfanumerico", "negro", true);
    	  Pantalla pantalla= new Pantalla("negro", "samsung", "full hd", 1080);
    	  Bateria bat= new Bateria("Voltistar", "negro", 4, 110);
    	  
    	  Laptop lap1= new  Laptop("negro", "HP", "Pavilion", micro, te, pantalla, bat);
    	  System.out.println(lap1);
      }
    	  
    	
    		

   }

