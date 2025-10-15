package com.jsp.inbuiltclassMethods;

public class MathExample {
    public static void main(String[] args) {
        System.out.println("Absolute: " + Math.abs(-10));
        System.out.println("Max: " + Math.max(5, 9));
        System.out.println("Power: " + Math.pow(2, 4));
        System.out.println("Square Root: " + Math.sqrt(49));
        System.out.println("Cube Root: " + Math.cbrt(27));
        System.out.println("Round: " + Math.round(4.6));
        System.out.println("Ceil: " + Math.ceil(4.2));
        System.out.println("Floor: " + Math.floor(4.8));
        System.out.println("Random: " + Math.random());
        System.out.println("Sin(90°): " + Math.sin(Math.toRadians(90)));
        System.out.println("Log base e: " + Math.log(10));
        System.out.println("e^1: " + Math.exp(1));
    }
}
