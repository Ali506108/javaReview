package com.example.java8.calculate;

public class interfaceFunc {
    public static void main(String[] args) {
        Calculater plus = (double x, double y) -> x + y;
        Calculater minus = (double x, double y) -> x - y;
        Calculater multiply = (double x, double y) -> x * y;
        Calculater divide = (double x, double y) -> x / y;
        Calculater modulus = (double x, double y) -> x % y;

        System.out.println("Plus " + plus.calculate(5.2 , 5.6));

        System.out.println("Plus " + minus.calculate(5.2 , 5.6));

        System.out.println("Plus " + multiply.calculate(5.2 , 5.6));

        System.out.println("Plus " + divide.calculate(5.2 , 5.6));

        System.out.println("Plus " + modulus.calculate(5.2 , 5.6));
    }
}
