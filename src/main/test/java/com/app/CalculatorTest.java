package com.app;
import main.java.com.app.Calculator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Cette classe teste les méthodes de la classe Calculator.
 */
public class CalculatorTest {

    /**
     * Teste la méthode d'addition.
     */
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));  // 2 + 3 = 5
    }

    /**
     * Teste la méthode de soustraction.
     */
    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.subtract(3, 2));  // 3 - 2 = 1
    }

    /**
     * Teste la méthode de multiplication.
     */
    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals(6, calc.multiply(2, 3));  // 2 * 3 = 6
    }

    /**
     * Teste la méthode de division.
     */
    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.divide(6, 3));  // 6 / 3 = 2
    }

    /**
     * Teste la division par zéro.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        Calculator calc = new Calculator();
        calc.divide(1, 0);  // Doit lancer une exception
    }
}
