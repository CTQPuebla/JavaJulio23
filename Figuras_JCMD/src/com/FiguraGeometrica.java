package com;

public class FiguraGeometrica {
	
		
		 String Nombre;
		 
		 public FiguraGeometrica() {
			 
		 }

		public FiguraGeometrica(String nombre) {
			
			Nombre = nombre;
		}

		
		
		
		public String getNombre() {
			return Nombre;
		}

		public void setNombre(String nombre) {
			Nombre = nombre;
		}

		
		
		
		@Override
		public String toString() {
			return "FiguraGeometrica [Nombre=" + Nombre + "]";
		}
		 
	

}
