package ar.utn.dds;

import java.util.ArrayList;
import java.util.Iterator;

public class Combinador {

	public ArrayList<Prenda> combinacion = new ArrayList<Prenda>();
	
	
	public ArrayList<Prenda> CombinarTodo(ArrayList<Prenda> listaDeTorso, ArrayList<Prenda> listaDePiernas,
			ArrayList<Prenda> listaDePies) throws CombinacionExcepcion { //recibe las 3 listas
				
		if( listaDeTorso.isEmpty() || listaDePiernas.isEmpty() || listaDePies.isEmpty() ){
			throw new CombinacionExcepcion(); //error si alguna de las listas obligatorias esta vacia
		}else {
			Iterator<Prenda> torsoI = listaDeTorso.iterator();
			Iterator<Prenda> piernasI = listaDePiernas.iterator();
			Iterator<Prenda> piesI = listaDePies.iterator();

			while (torsoI.hasNext()) {
				combinacion.add(torsoI.next());
				while(piernasI.hasNext()) {
					combinacion.add(piernasI.next());
					while(piesI.hasNext()) {
						combinacion.add(piesI.next());//si necesito pasarlas a otra lista puedo guardar el size en una lista de int
						break;	}
					break;	}
			}
			return combinacion;	
		}
	}
	
	
	public ArrayList<Prenda> CombinarTodo(ArrayList<Prenda> listaDeTorso, ArrayList<Prenda> listaDePiernas,
			ArrayList<Prenda> listaDePies, ArrayList<Prenda> listaDeAcce) throws CombinacionExcepcion { //recibe las 4 listas
		
		if( listaDeTorso.isEmpty() || listaDePiernas.isEmpty() || listaDePies.isEmpty() ){
			throw new CombinacionExcepcion(); //error si alguna de las listas obligatorias esta vacia
		}else {
			Iterator<Prenda> torsoI = listaDeTorso.iterator();
			Iterator<Prenda> piernasI = listaDePiernas.iterator();
			Iterator<Prenda> piesI = listaDePies.iterator();
			Iterator<Prenda> accI = listaDeAcce.iterator();

			while (torsoI.hasNext()) {
				combinacion.add(torsoI.next());
				while(piernasI.hasNext()) {
					combinacion.add(piernasI.next());
					while(piesI.hasNext()) {
						combinacion.add(piesI.next());//si necesito pasarlas a otra lista puedo guardar el size en una lista de int
						while(accI.hasNext()) {
							combinacion.add(accI.next());
							break;	}
						break;	}
					break;	}
			}
			return combinacion;	
		}
	}
		
	
	
	
}
