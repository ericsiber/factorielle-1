package co.simplon.factorielle;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorielleTest {

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

}
