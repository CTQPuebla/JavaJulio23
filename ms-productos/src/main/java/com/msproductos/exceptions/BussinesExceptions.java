package com.msproductos.exceptions;

public class BussinesExceptions extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String mensaje;
	 public BussinesExceptions() {
	  super();
	 }

	 public BussinesExceptions(String message) {
	  this.mensaje = message;
	 }

	 @Override
	 public String getMessage() {
	  return this.mensaje;
	 }
}
