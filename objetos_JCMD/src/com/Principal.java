package com;

public class Principal {
	public static void main(String[] args) {
		
		String m= "inkbbn";
		
//		Audifonos au = new Audifonos();
//		au.setColor("negro");
//		au.setMarca("vorago");
//		au.setModelo("HPB-78");
//		au.setTamaño("grande");
//		au.setTipo("diadema");
//		au.setConectividad("bluetooth");
//		au.setFrecuencia(40.0);
//		au.setBotones(4);
//		
//		
//		Audifonos au2 = new Audifonos("gris", "sony","MX-456", "Grande", "inalambrico", "bluetooth", 4, 4.0);
//		//System.out.println(au2);
//		
//		
//		
//		Balon bl= new Balon();
//		bl.setColor("blanco y negro");
//		bl.setMarca("voit");
//		bl.setTamaño(4);
//		bl.setMaterial("cuero y sintetico");
//		bl.setDeporte("futbol");
//		bl.setPrecio(110.50);
//		
//		Balon bl2 = new Balon("azul marino", "sports", 5, "sintetico", "futbol", 150.60);
//		System.out.println(bl2);
		
		Auto a1 = new Auto();//objeto inicializado vacio
		
		
		
		
		
		
//		Motor motor1= new Motor("v", 6, 36, 250);
//		
//		String []interiores = {"pantalla touch","3 filas asientos","clima 6 zonas",
//				"salidas usb","forro en piel","quemacocos","9bocinas","cinturones"};
//		
//		Auto a2 = new Auto("Q7", "Audi", "negro", "alta",motor1, interiores);
//		System.out.println(a2);
		
		
		Laptop lp1= new Laptop();//inicializado en vacio
		Pantalla pantalla=new Pantalla("lcd", 14);
		Procesador procesador = new Procesador("intel", "7ma generacion", 3, 4);
		Almacenamiento almacenamiento = new Almacenamiento("KIGSTON", "SSD", 256);
		
		
		String []general= {"4gb en RAM","BATERIA DE LARGA DURACION","teclado rgb","2 bocinas","con cargador tipos usb","3 años de garantia"};
		
		Laptop lp2 = new Laptop("lenovo", "gris", "ideapad 33os", procesador, pantalla, almacenamiento, general);
		System.out.println(lp2);
	}

}
