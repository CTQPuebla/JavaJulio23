package com;

public class Principal {
	public static void main(String[] args) {
		///////////////////EMPIEZA PRIMER OBJETO AUDIFONOS-CARRO
//		String m = "werrew;";
//		Audifonos au = new Audifonos();
//		
//		
//		au.setColor("Negro");
//		au.setMarca("Pionner");
//		au.setModelo("HK-231");
//		au.setModelo("Grande");
//		au.setTipo("Diadema");
//		au.setConectividad("Bluetooth");
//		au.setFrecuencia(40.0);
//		au.setBotones(4);
//		
//		Audifonos au2 = new Audifonos("Negro", "Sony", "MX-4000", "Grande", "Inalambrico", "Bluetooth", 5, 40.0);
//		
//		System.out.println(au);
//		
//		
//		Automovil crr = new Automovil();
//		crr.setColor("Negro mate");
//		crr.setMarca("Audi");
//		crr.setModelo("R8");
//		crr.setTamaño("Mediano");
//		crr.setTipo("Deportivo");
//		crr.setPasajeros(5);
//		crr.setCilindraje(5000);
//		crr.setVelocidad(330);
//		
//		Automovil crr2 = new Automovil("Audi", "R8", "Negro Mate", "Deportivo", "Meidano", 5000, 330, 5);
//		
//		System.out.println(crr);
//		System.out.println(crr2);
		/////////////////////////////// TERMINA PRIMER OBJETO AUDIFONOS-CARRO
//		
//		
//		//***************+ INICIA SEGUNDO OBJETOS CARRO-MOTOR***********+
//		AutoProfe a1 = new AutoProfe();
//		
//		Motor motor1 = new Motor("V", 6, 3.6, 250.0, "Gasolina");
//		
//		String[]  interiores = {"Pantalla touch", "3 filas asientos", "Clima 6 zonas",
//				"Salidas USB", "Forro en piel", "Quemacocos", "9 bocinas", "cinturones",
//				"10 bolsas de aire"};
//		
//		AutoProfe a2 = new AutoProfe("V8", "Audi", "Negro", "Alta", motor1, interiores);
//		
//		System.out.println(a2);
//		
		//****************TERMINA SEGUNDO OBJETO CARRO-MOTOR**********
		
		
		Computadora c1 = new Computadora();
		
		Software sf = new Software("Windows", "kasperski", "Chrome", "Office 365", "Anydesk", 685, 365, 000, 620, 250);
		
		String[] teclas = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","v","w","x","y","z",
				"1","2","3","4","5","6","7","8","9","0"};
		
		
		Computadora c2 = new Computadora("Plata", "HP", "Envy", "Lap-top", 16.6f, 1.80f, sf, teclas);
		
		System.out.println(c2);
		
	}

}
