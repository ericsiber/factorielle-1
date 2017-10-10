package co.simplon.factorielle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactorielleTest {

	@Test(timeout = 1)
	public void factorielle_de_18_doit_s_executer_en_100_iterations_en_moins_de_1_ms() {
		// GIVEN
		long n = 18;
		Factorielle factorielle = new Factorielle();
		
		// WHEN
		for (int i=0; i< 100; i++)
			factorielle.calculer(n);
	
		// THEN
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void factorielle_de_moins_1_doit_renvoyer_une_exception() {
		// GIVEN
		long n = -1;
		Factorielle factorielle = new Factorielle();
		
		// WHEN
		factorielle.calculer(n);
	
		// THEN
	}
	
	@Test
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
