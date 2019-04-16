package ar.utn.dds;

public class Prenda {
	
	public String nombre;
	public int cantidad;
	
	
	
	public Prenda(String nombre, int cantidad) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public void mostrarDatos() {
		System.out.println("ListaDePrendas: "+this.nombre+this.cantidad);
		
	}
	
	

	
}
