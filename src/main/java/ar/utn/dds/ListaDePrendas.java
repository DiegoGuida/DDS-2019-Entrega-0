package ar.utn.dds;

import java.util.ArrayList;


public class ListaDePrendas {
	
	private ArrayList<Prenda> listaDePrendas;

	/*
	private ArrayList<Prenda> listaDePrendasSugerida;

	public void Combinar(ArrayList<Prenda> listaACombinar) {
		listaDePrendasSugerida = new ArrayList <Prenda>();
				
		
		}
	*/
	
	public ListaDePrendas() {
		listaDePrendas = new ArrayList <Prenda>();
		}
	
	public void agregarPrenda(Prenda prenda) {
		listaDePrendas.add(prenda);
	}
	
	public void listar() {
	//	System.out.println ("se muesta la ListaDePrendas");
		for (Prenda tmp: listaDePrendas) {
			tmp.mostrarDatos();
		}

	}
	
	
}
