package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class BouncerInDiscoStoryWithMoreFunctions {
    public static void main(String[] args) {
        System.out.println("Someone tries to enter the disco");

        // System.out.println iškelti į funkciją.
        // Koks atsakymo tipas, kintamieji, ką daro funkcija.
        // Stringas turi būti kaip parametras.
        // Ką gražina funkcija? Tipas void, return nereikia.

        int age;
        int height;
        boolean isAbleToSingWell;
        Scanner inputReader = new Scanner(System.in);


        printText("Now trial with first bouncer");

        printText("How old are You? ");
        age = readIntNumber(inputReader);

        printText("Can You sing well? ");
        isAbleToSingWell = inputReader.nextBoolean();

        printText("How tall are You? ");
        height = readIntNumber(inputReader);



        if (checkedByYoungBouncer(age, height, isAbleToSingWell)) {
            System.out.println("Welcome to party!!!");
        } else {
            printText("Sorry, go home");

            printText("I'll try with second bouncer");

            printText("Second bounder is starting to ask questions");
            printText("How old are You? ");
            age = readIntNumber(inputReader);

            printText("Can You sing well? ");
            isAbleToSingWell = inputReader.nextBoolean();

            printText("How tall are You? ");
            height = readIntNumber(inputReader);

            boolean canEnterTheParty = checkedByOldBouncer(age, height, isAbleToSingWell);

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

    public static int readIntNumber(Scanner inputReader) {
        return inputReader.nextInt();
    }

    // kai funkcija void - nereikia return
    public static void printText(String myFunctionParameter ) {
        System.out.println(myFunctionParameter);
    }


}

