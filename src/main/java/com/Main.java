package main.java.com;

import main.java.com.app.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Addition : " + calc.add(5, 3));
        System.out.println("Multiplication : " + calc.multiply(4, 2));
    }
}
