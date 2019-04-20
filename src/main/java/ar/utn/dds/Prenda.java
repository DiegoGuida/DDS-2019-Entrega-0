package ar.utn.dds;

public class Prenda {
	
	public String nombre;
	public int modelo;
	public String tipo;	//TODO ver si es necesario qe sea enum
	
		
	public Prenda(String nombre, int modelo, String tipo) {
		super();
		this.nombre = nombre;
		this.modelo = modelo;
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getModelo() {
		return modelo;
	}
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void mostrarDatos() {
		System.out.println("ListaDePrendas: "+this.nombre+this.modelo+this.tipo);
		
	}
	
	

	
}
