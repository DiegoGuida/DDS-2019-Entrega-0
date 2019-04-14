package ar.utn.dds;

public class Pies extends Prenda {


	public boolean llevaMedias;
	
	
	public Pies(String nombre, int cantidad, boolean llevaMedias) {
		super(nombre, cantidad);
		setLlevaMedias(llevaMedias);
		
	}


	public boolean isLlevaMedias() {
		return llevaMedias;
	}


	public void setLlevaMedias(boolean llevaMedias) {
		this.llevaMedias = llevaMedias;
	}

	


	
	
}
