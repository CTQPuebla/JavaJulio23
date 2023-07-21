package com;

public class Hexagono extends Figuras_Geometricas implements Operaciones {

	 double apotema;
	 double lado;
	 double altura;

	 public Hexagono() {

	 }

	 public Hexagono(double apotema, double lado, double altura) {
	  super();
	  this.apotema = apotema;
	  this.lado = lado;
	  this.altura = altura;
	 }

	 public double getApotema() {
	  return apotema;
	 }

	 public void setApotema(double apotema) {
	  this.apotema = apotema;
	 }

	 @Override
	 public String toString() {
	  return "Hexagono [apotema=" + apotema + "]";
	 }

	 @Override
	 public double perimetro(double numero) {
	  // TODO Auto-generated method stub
	  return numero * 6;
	 }

	 @Override
	 public double perimetro() {
	  // TODO Auto-generated method stub
	  return this.lado * 6;
	 }

	 @Override
	 public double area(double numero) {
	  // TODO Auto-generated method stub
	  return (this.perimetro()* numero)/2;
	 }

	 @Override
	 public double area() {
	  // TODO Auto-generated method stub
	  return (this.perimetro()* this.apotema)/2;
	 }

	 @Override
	 public double volumen() {
	  // TODO Auto-generated method stub
	  return 3*this.lado *this.apotema * this.altura;
	 }

	}