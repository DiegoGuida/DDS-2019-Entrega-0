package ar.utn.dds;

//import org.junit.Before;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;


public class PrendaTest {
	
	private Prenda t1;
	private Prenda t2;	
	private Prenda p1;
	private Prenda p2;
	private Prenda pies1;
	private Prenda pies2;
	private Prenda acc1;

		
/*	
	@Before 
	public void init() throws Exception {
		
		t1 = new Prenda("remera azul", 1,"torso");
		t2 = new Prenda("remera verde", 1,"torso");
		p1 = new Prenda("jean",1,"piernas");
		p2 = new Prenda("bermuda",1,"piernas");
		pies1 = new Prenda("zapa",2,"pies"); 
		pies2 = new Prenda("ojotas",2,"pies");
		acc1 = new Prenda("aros",2,"accesorios");
		
		ArrayList<Prenda> lt1 = new ArrayList<Prenda>();
		lt1.add(t1);
		lt1.add(t2);
		
		ArrayList<Prenda> lp1 = new ArrayList<Prenda>();
		lp1.add(p1);
		lp1.add(p2);
		
		ArrayList<Prenda> lpi1 = new ArrayList<Prenda>();
		lpi1.add(pies1);
		lpi1.add(pies2);
		
		ArrayList<Prenda> lacc1 = new ArrayList<Prenda>();
		lacc1.add(acc1);
				
		ArrayList<Prenda> combinacion = new ArrayList<Prenda>();
		Combinador c1 = new Combinador();
	//	c1.listaDeAccesorios.add(acc1);
		combinacion = c1.CombinarTodo(lt1, lp1, lpi1);
		
		for (Prenda tmp: combinacion) {
			tmp.mostrarDatos();
		}
		
		
	}
	*/
	
	
	@Test
	public void combinacionOk() throws Exception {
			
		t1 = new Prenda("remera azul", 1,"torso");
		t2 = new Prenda("remera verde", 1,"torso");
		p1 = new Prenda("jean",1,"piernas");
		p2 = new Prenda("bermuda",1,"piernas");
		pies1 = new Prenda("zapa",2,"pies"); 
		pies2 = new Prenda("ojotas",2,"pies");
		acc1 = new Prenda("aros",2,"accesorios");
		
		ArrayList<Prenda> lt1 = new ArrayList<Prenda>();
		lt1.add(t1);
		lt1.add(t2);
		
		ArrayList<Prenda> lp1 = new ArrayList<Prenda>();
		lp1.add(p1);
		lp1.add(p2);
		
		ArrayList<Prenda> lpi1 = new ArrayList<Prenda>();
		lpi1.add(pies1);
		lpi1.add(pies2);
		
		ArrayList<Prenda> lacc1 = new ArrayList<Prenda>();
		lacc1.add(acc1);
				
		ArrayList<Prenda> combinacion = new ArrayList<Prenda>();
		Combinador c1 = new Combinador();
		combinacion = c1.CombinarTodo(lt1, lp1, lpi1,lacc1);
		
	/*	for (Prenda tmp: combinacion) {
			tmp.mostrarDatos();
		}
	*/	
		
		Assert.assertEquals( lt1.size()+lp1.size()+lpi1.size()+lacc1.size() , combinacion.size() );		
			
	}
	

	@Test(expected=CombinacionExcepcion.class) //este test da positivo si y solo si arroja la excepcion
	public void testSinTorso() throws Exception {
		
		Combinador c1 = new Combinador();
		ArrayList<Prenda> lt1 = new ArrayList<Prenda>();
		ArrayList<Prenda> lp1 = new ArrayList<Prenda>();
		lp1.add(p1);
		ArrayList<Prenda> lpi1 = new ArrayList<Prenda>();
		lpi1.add(pies1);
	//	ArrayList<Prenda> lacc1 = new ArrayList<Prenda>();
		
		c1.CombinarTodo(lt1, lp1, lpi1);
		
		
	}
	

}
