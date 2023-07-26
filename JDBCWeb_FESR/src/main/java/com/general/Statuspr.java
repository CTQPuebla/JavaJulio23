package com.general;

public class Statuspr {
	
	
	private String mensaje;
	private String respuesta;
	private Object ob;
	public Object getOb() {
		return ob;
	}

	public void setOb(Object ob) {
		this.ob = ob;
	}

	public Statuspr() {}

	public Statuspr(String mensaje, String respuesta) {
		super();
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

	@Override
	public String toString() {
		return "Status [mensaje=" + mensaje + ", respuesta=" + respuesta + "]";
	}
	

}

	


