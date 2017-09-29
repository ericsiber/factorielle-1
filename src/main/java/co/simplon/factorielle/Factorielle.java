package co.simplon.factorielle;

/**
 * Factorielle
 */
public class Factorielle 
{
    public Factorielle() {
    		super();
    }
    
    public long calculer(long n) {
    		System.out.println("Appel de la méthode calculer avec le paramètre " + n);
    		long resultat;
    		if (n > 1) {
    			resultat = n * calculer(n-1);
    		} else if (n < 0) {
    			System.err.println("Cas d'erreur détecté, entier négatif non supporté : " + n);
    			throw new IllegalArgumentException();
    		} else {
    			resultat = 1;
    		}
    		System.out.println("Résultat de l'appel avec " + n + " = " + resultat);
    		return resultat;
    }

}
