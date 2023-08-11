package comDTO;

public class DetallesProductoDTO {
	
	private String nombre;
	private double precioVenta;
	private int stock;
	private String nombreProveedor;
	
	public DetallesProductoDTO(String nombre, double precioVenta, int stock, String nombreProveedor) {
		this.nombre = nombre;
		this.precioVenta = precioVenta;
		this.stock = stock;
		this.nombreProveedor = nombreProveedor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getNombreProveedor() {
		return nombreProveedor;
	}
	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}
	@Override
	public String toString() {
		return "DetallesProductoDTO [nombre=" + nombre + ", precioVenta=" + precioVenta + ", stock=" + stock
				+ ", nombreProveedor=" + nombreProveedor + "]";
	}
	
	
	

}
