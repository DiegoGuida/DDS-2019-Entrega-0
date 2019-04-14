package ar.utn.dds;

import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;


public class PrendaTest {
	
	private Torso t1;
	private Piernas p1;
	private Pies pies1;
	
	@Before 
	public void init() {
		t1 = new Torso("remera azul", 1);
		p1 = new Piernas("jean",1);
		pies1 = new Pies("zapa",2,true);
		
	}
	
	@Test
	public void prueba() {
		Assert.assertEquals(t1.getCantidad() , p1.getCantidad());		
		Assert.assertTrue(pies1.isLlevaMedias());
				
	}

	

}
