package com.general;

public class Status {

	private String mensaje;
	private String respuesta;
	private Object ob;
	
	public Status() {}

	public Status(String mensaje, String respuesta) {
		this.mensaje = mensaje;
		this.respuesta = respuesta;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}
	
	

	public Object getOb() {
		return ob;
	}

	public void setOb(Object ob) {
		this.ob = ob;
	}

	@Override
	public String toString() {
		return "Status [mensaje=" + mensaje + ", respuesta=" + respuesta + "]";
	}
	
    
	
}
