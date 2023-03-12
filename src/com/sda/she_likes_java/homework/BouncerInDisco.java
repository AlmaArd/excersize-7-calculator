package com.sda.she_likes_java.homework;

import java.util.Scanner;

//Exercise 9.
//Bouncer in a disco
//Prepare a new class BouncerInDisco and in it
//- get the user’s age and height from the console
//- only people who are at least 16 years old and taller (or shorter than - at your choice) can enter the disco
//- print a text saying how the verification went in both cases
public class BouncerInDisco {
    public static void main(String[] args) {
        System.out.println("Exercise 9 - Bouncer in disco");

        System.out.println();

        System.out.println("Welcome to the disco, tell me how old are You");
        Scanner inputReader = new Scanner(System.in);
        String refusingMessage = "Oh sorry. You' re not allowed to enter the disco!!!";
        int userAge = inputReader.nextInt();

        // boolean test = userHeight <= 1.6 && personHeight >= 1.45
        // if (test) {

        if (userAge >= 18) {
            System.out.println("OK, so You' re adult:)");
            System.out.println("And now tell me Your height");
            double userHeight = inputReader.nextDouble();
             if (userHeight > 1.6) {
                 System.out.println("Please enter the disco");
            } else {
                System.out.println(refusingMessage);
            }
        } else {
            System.out.println(refusingMessage);
        }
    }
}
