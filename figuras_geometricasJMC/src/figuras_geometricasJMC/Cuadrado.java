package figuras_geometricasJMC;

public class Cuadrado extends FiguraGeometrica implements Calculo{

	 double lado;
	 
	 public Cuadrado() {
	  
	 }

	 public Cuadrado(double lado) {
	  this.lado = lado;
	 }

	 public double getLado() {
	  return lado;
	 }

	 public void setLado(double lado) {
	  this.lado = lado;
	 }

	 @Override
	 public String toString() {
	  return "Cuadrado [lado=" + lado + "]";
	 }

	 @Override
	 public double perimetro(double numero) {
	  // TODO Auto-generated method stub
	  return numero*4;
	 }

	 @Override
	 public double perimetro() {
	  // TODO Auto-generated method stub
	  return this.lado *4;
	 }

	 @Override
	 public double area(double numero) {
	  // TODO Auto-generated method stub
	  return numero*numero;
	 }

	 @Override
	 public double area() {
	  // TODO Auto-generated method stub
	  return this.lado * this.lado;
	 }

	 @Override
	 public double volumen() {
	  // TODO Auto-generated method stub
	  return Math.pow(this.lado, 3);
	 }

	 
	 
	

}
