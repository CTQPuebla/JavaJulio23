package com;

public class Principal2 {
public static void main(String[] args) {
	
Computadora C1= new Computadora ();
Procesador pro1= new Procesador(64, 12, "L2", 3.5);
Pantalla p1= new Pantalla(1920*1080, 14, "oled");
String [] perifericos= {"camara", "bocinas", "microfono"};


Computadora c2= new Computadora("negro", "acer", "aspire", "mediana", "portatil", "windows", perifericos, pro1, p1);
	System.out.println(c2);

}
}
