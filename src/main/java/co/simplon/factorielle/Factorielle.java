package co.simplon.factorielle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Factorielle
 */
public class Factorielle 
{
	private static Logger LOGGER = LoggerFactory.getLogger(Factorielle.class);
	
    public Factorielle() {
    		super();
    }
    
    public long calculer(long n) {
    		LOGGER.debug("Appel de la méthode calculer avec le paramètre " + n);
    		long resultat;
    		if (n > 1) {
    			resultat = n * calculer(n-1);
    		} else if (n < 0) {
    			LOGGER.error("Cas d'erreur détecté, entier négatif non supporté : " + n);
    			throw new IllegalArgumentException();
    		} else {
    			resultat = 1;
    		}
    		LOGGER.info("Résultat de l'appel avec " + n + " = " + resultat);
    		return resultat;
    }

}
