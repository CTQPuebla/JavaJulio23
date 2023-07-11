package com;

public class principal {
public static void main (String[] args) {
	
	
//	String m ="iweriweriw";
//	Audifonos au = new Audifonos();
//	au.setColor("negro");
//	au.setMarca("vorago");
//	au.setModelo("HPB-401");
//	au.setTamaño("grande");
//	au.setTipo("diadema");
//	au.setConectividad("Bluetooth");
//	au.setFrecuencia(40.0);
//	au.setBotones(4);
//	
//	Audifonos au2 = new Audifonos("gris","sony","MX-4000","Grande","Inalabrico","Bluetooth",5,40.0); 
//	
//	
//	System.out.println(au2);
//	
//
//
//
//
//String w = "computadora-WER";
//computadora cp = new computadora();
//cp.setColor("negro");
//cp.setMarca("Dell");
//cp.setModelo("Alienware R15");
//cp.setProcesador("Intel core i7");
//cp.setTamaño("grande");
//cp.setGrafica("Nvidia Gforce rtx3090");
//cp.setRGB(true);
//
//computadora cp2 = new computadora("negro","dell","Alienware R15","Intel core i7","grande","Nvidia Gforce rtx3090",true); 
//
//System.out.println(cp);








auto a1 = new auto(); // objeto inicializado vacio


motor motor1 = new motor("v",6,3.6,250,"Gasolina");
String[] interior = {"pantalla touch","3 filas asientos","clima 6 zonas","salidas usb",
		"forro de piel","quemacocos","bocinas","cinturones","10 bolsas de aire"};

auto a2 = new auto("Q7","audi","negro", "altura",motor1, interior);

System.out.println(a2);


}	
}
