package main.java.com.app;

/**
 * Cette classe fournit des méthodes de calcul pour des opérations arithmétiques de base.
 * Elle inclut des méthodes pour additionner, soustraire, multiplier et diviser des entiers.
 */
public class Calculator {

    /**
     * Effectue l'addition de deux entiers.
     *
     * @param a Le premier entier
     * @param b Le deuxième entier
     * @return La somme de a et b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Effectue la soustraction de deux entiers.
     *
     * @param a Le premier entier
     * @param b Le deuxième entier
     * @return La différence entre a et b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Effectue la multiplication de deux entiers.
     *
     * @param a Le premier entier
     * @param b Le deuxième entier
     * @return Le produit de a et b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Effectue la division de deux entiers. Si le second entier est égal à zéro,
     * une exception IllegalArgumentException est lancée.
     *
     * @param a Le numérateur
     * @param b Le dénominateur
     * @return Le quotient de a et b
     * @throws IllegalArgumentException Si b est égal à zéro
     */
    public int divide(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Division par zéro !");
        return a / b;
    }
}
