package co.simplon.factorielle;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class FactorielleTest {

	@Test
	@Ignore
	public void factorielle_de_0_doit_renvoyer_1() {
		// GIVEN
		long n = 0;
		Factorielle factorielle = new Factorielle();
		
		// WHEN
		long resultat = factorielle.calculer(n);
		
		// THEN
		assertEquals(1, resultat);
	}
	
	@Test
	public void factorielle_de_1_doit_renvoyer_1() {
		// GIVEN
		long n = 1;
		Factorielle factorielle = new Factorielle();
		
		// WHEN
		long resultat = factorielle.calculer(n);
		
		// THEN
		assertEquals(1, resultat);
	}
	
	@Test
	public void factorielle_de_2_doit_renvoyer_2() {
		// GIVEN
		long n = 2;
		Factorielle factorielle = new Factorielle();
		
		// WHEN
		long resultat = factorielle.calculer(n);
		
		// THEN
		assertEquals(2, resultat);
	}
	
	@Test
	public void factorielle_de_3_doit_renvoyer_6() {
		// GIVEN
		long n = 3;
		Factorielle factorielle = new Factorielle();
		
		// WHEN
		long resultat = factorielle.calculer(n);
		
		// THEN
		assertEquals(6, resultat);
	}

	@Test
	public void factorielle_de_19_doit_renvoyer_121645100408832000() {
		// GIVEN
		long n = 19;
		Factorielle factorielle = new Factorielle();
		
		// WHEN
		long resultat = factorielle.calculer(n);
		
		// THEN
		assertEquals(121645100408832000l, resultat);
	}

}
