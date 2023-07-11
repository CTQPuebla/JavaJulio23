package com;

public class Principa {
public static void main(String[] args) {
	
String m= "probando";
//	
//	Audifonos au = new Audifonos ();
//	
//	au.setColor("negro");
//	au.setMarca("vorago");
//	au.setModelo("HPB-401");
//	au.setTipo("diadema");
//	au.setConectividad("bluetooth");
//	au.setFrecuencia(40.0);
//	au.setBotones(4);
//	au.setTamaño("grande");
//	
//	System.out.println(au);
//	
//	
//	Audifonos au2= new Audifonos ("Gris","Sony", "MX-4000","Grande","Inalambrico","Bluetooth",5,40.0);
//	System.out.println(au2);
//	
	
//	Lentes au= new Lentes ();
//	au.setColor("negros");
//	au.setForma("Redondo");
//	au.setTipo("bifocales");
//	au.setTamaño("grandes");
//	au.setGrosor("convergentes");
//	System.out.println(au);
//	
//	Lentes nuevo = new Lentes ("blancos", "Cuadrados", "monofocales", "pequeños", "divergentes");
//	System.out.println(nuevo);
//	}
//	
	
	


Auto a1= new Auto ();

Motor motor1= new Motor("V", 6, 3.6, 250, "gasolina");
String[]interiores= {"pantalla touch", "3 filas asientos","Clima 6 zonas","Salidas USB",
		"Forro en piel", "Quemacocos","9 bocinas","Cinturones","10 bolsas de aire"};

Auto a2= new Auto ("Q7", "Audi","negro", "Alta", motor1, interiores);
System.out.println(a2);

}



 
}

