package ar.utn.dds;

import org.junit.Before;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;


public class PrendaTest {
	
	private Torso t1;
	private Torso t2;	
	private Piernas p1;
	private Piernas p2;
	private Pies pies1;
	private Pies pies2;

	
	@Before 
	public void init() {
		
		t1 = new Torso("remera azul", 1);
		t2 = new Torso("remera verde", 1);
		p1 = new Piernas("jean",1);
		p2 = new Piernas("bermuda",1);
		pies1 = new Pies("zapa",2,true); //el true-false pregunta si lleva medias
		pies2 = new Pies("ojotas",2,false);
		
		ArrayList<Torso> lt1 = new ArrayList<Torso>();
		lt1.add(t1);
		lt1.add(t2);
		
		ArrayList<Piernas> lp1 = new ArrayList<Piernas>();
		lp1.add(p1);
		lp1.add(p2);
		
		ArrayList<Pies> lpi1 = new ArrayList<Pies>();
		lpi1.add(pies1);
		lpi1.add(pies2);
		
		
		ArrayList<Prenda> combinacion = new ArrayList<Prenda>();
		Convinador c1 = new Convinador();
	//	c1.listaDePiernas.add(p1);
		combinacion = c1.ConvinarTodo(lt1, lp1, lpi1);
		
		for (Prenda tmp: combinacion) {
			tmp.mostrarDatos();
		}
		
		
	}
	
	@Test
	public void prueba() {
		Assert.assertEquals(t1.getCantidad() , p1.getCantidad());		
		Assert.assertTrue(pies1.isLlevaMedias());
				
	}

	

}
