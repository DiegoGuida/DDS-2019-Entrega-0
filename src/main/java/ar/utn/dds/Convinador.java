package ar.utn.dds;

import java.util.ArrayList;

public class Convinador {
	
	public ArrayList<Torso> listaDeTorso;
	public ArrayList<Piernas> listaDePiernas;
	public ArrayList<Pies> listaDePies;
//	public ArrayList<Accesorios> listaDeAccesorio;
	
	public ArrayList<Prenda> combinacion = new ArrayList<Prenda>();
	
	
	public ArrayList<Prenda> ConvinarTodo(ArrayList<Torso> listaDeTorso, ArrayList<Piernas> listaDePiernas, 
							ArrayList<Pies> listaDePies) { //recibe las 3 listas
		
		Torso torso1 = listaDeTorso.get(0);
		Piernas pierna1 = listaDePiernas.get(1);
		Pies pies1 = listaDePies.get(0);
		
		combinacion.add(torso1);
		combinacion.add(pierna1);
		combinacion.add(pies1);
		
		return combinacion;
		
	}
	
	
	
	
	
	
}
