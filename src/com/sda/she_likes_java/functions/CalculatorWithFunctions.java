package com.sda.she_likes_java.functions;

public class CalculatorWithFunctions {
    public static void main(String[] args) {
        System.out.println("Let's start calculations");

        sum (10, 20);
        sum (1, 2);
    }
    public static int sum(int first, int second) {
        System.out.println("I'm not so smart calculator");
        int result = first + second;
        System.out.println( "Result of calculation is: " +result);
        return result;
    }

}
