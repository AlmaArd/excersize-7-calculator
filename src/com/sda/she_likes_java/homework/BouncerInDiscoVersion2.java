package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class BouncerInDiscoVersion2 {

    public static void main(String[] args) {
        System.out.println("Party time???");

        System.out.println("Somebody is coming to club");
        System.out.println("Hi, how old are You?");

        Scanner inputReader = new Scanner(System.in);
        String declineMessage = "Sorry, go home:)";

        int age = inputReader. nextInt();
        if (age >= 18) {
            System.out.println("So, you're adult:)");
            System.out.println("Let me know Your height");
            int height =inputReader.nextInt();
            if (height >= 200 ){
                System.out.println("Great!!!! Welcome to the party:)");
            } else {
                System.out.println(declineMessage);
            }
        } else {
            System.out.println(declineMessage);
        }
    }
}
