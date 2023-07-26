package comDTO;

public class DetallesDTO {
	
	private String nombreproducto;
	private String refrigerado;
	private String nombredepa;
	private String nombreempleado;
	public DetallesDTO(String nombreproducto, String refrigerado, String nombredepa, String nombreempleado) {
		
		this.nombreproducto = nombreproducto;
		this.refrigerado = refrigerado;
		this.nombredepa = nombredepa;
		this.nombreempleado = nombreempleado;
	}
	public String getNombreproducto() {
		return nombreproducto;
	}
	public void setNombreproducto(String nombreproducto) {
		this.nombreproducto = nombreproducto;
	}
	public String getRefrigerado() {
		return refrigerado;
	}
	public void setRefrigerado(String refrigerado) {
		this.refrigerado = refrigerado;
	}
	public String getNombredepa() {
		return nombredepa;
	}
	public void setNombredepa(String nombredepa) {
		this.nombredepa = nombredepa;
	}
	public String getNombreempleado() {
		return nombreempleado;
	}
	public void setNombreempleado(String nombreempleado) {
		this.nombreempleado = nombreempleado;
	}
	@Override
	public String toString() {
		return "DetallesDTO [nombreproducto=" + nombreproducto + ", refrigerado=" + refrigerado + ", nombredepa="
				+ nombredepa + ", nombreempleado=" + nombreempleado + "]";
	}
	
	
	

}
