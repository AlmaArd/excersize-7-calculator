package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class BouncerInDiscoStoryWithFunctions {
    public static void main(String[] args) {
        System.out.println("Someone tries to enter the disco");

        int age;
        int height;
        boolean isAbleToSingWell;
        Scanner inputReader = new Scanner(System.in);

        System.out.println("Now trial with first bouncer");

        System.out.println("How old are You? ");
        age = inputReader.nextInt();

        System.out.println("Can You sing well? ");
        isAbleToSingWell = inputReader.nextBoolean();

        System.out.println("How tall are You? ");
        height = inputReader.nextInt();

        boolean canEnterTheParty = checkedByYoungBouncer(age, height, isAbleToSingWell);

        if (canEnterTheParty) {
            System.out.println("Welcome to party!!!");
        } else {
            System.out.println("Sorry, go home");

            System.out.println("I'll try with second bouncer");

            System.out.println("Second bounder is starting to ask questions");
            System.out.println("How old are You? ");
            age = inputReader.nextInt();

            System.out.println("Can You sing well? ");
            isAbleToSingWell = inputReader.nextBoolean();

            System.out.println("How tall are You? ");
            height = inputReader.nextInt();

            canEnterTheParty = checkedByOldBouncer(age, height, isAbleToSingWell);

            if (canEnterTheParty) {
                System.out.println("Ahhh - great. Let's party");
            } else {
                System.out.println(":(:(:(");
            }
        }

    }

    // first line is function prototype
    public static boolean checkedByYoungBouncer(int age, int height, boolean isAbleToSingWell) {
        return age >= 18 && height > 180 && isAbleToSingWell == true;
    }

    public static boolean checkedByOldBouncer(int age, int height, boolean isAbleToSingWell) {
        return age >= 18 || height > 180 || isAbleToSingWell == true;
    }
}

