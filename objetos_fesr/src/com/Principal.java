package com;

public class Principal {
	public static void main(String[] args) {
		String m = "probando";
		Auto a1 = new Auto();
		Motor motor1 = new Motor("V",6,3.6,250,"Gasolina");
		String[] interiores = {"Pantalla touch","3 filas asientos","Clima 6 zonas","Salidas USB",
				"Forro de piel","quemacocos","9 bocinas","cinturones","10 bolsas de aire"};
		
		Auto a2 = new Auto("Q7","Audi","Negro","Alta",motor1,interiores);
		System.out.println(a2);
	}
	


}
