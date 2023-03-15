package com.sda.she_likes_java.loops.while_loop;

import java.sql.SQLOutput;

public class WhileLoop {
    public static void main(String[] args) {
        // how to make our calculations in a loop
        System.out.println("I'm here");
        System.out.println("I'm here");
        System.out.println("I'm here");

        boolean condition = false;
        // while loop is going to be executed only when condition is true
        // the body of while loop is going to be repeated as many times as condition is true
        while (condition) {
            System.out.println("Java forever");
        }

        int numberOfTrials = 5;
        System.out.println("Current value of numberOfTrials: " +numberOfTrials);
        while (numberOfTrials >0 ) {
            System.out.println("I'm working");
            // first right part of the expression is evaluated and is assigned to variable
            numberOfTrials = (numberOfTrials - 1);
            if (numberOfTrials % 2 == 1) { // printing just odd numbers
                System.out.println("Current value of number of trials: " + numberOfTrials);
            }

        }
            System.out.println("The end");
    }
}
