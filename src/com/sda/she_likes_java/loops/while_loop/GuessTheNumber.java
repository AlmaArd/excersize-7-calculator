package com.sda.she_likes_java.loops.while_loop;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random numberGenerator = new Random();
        int someRandomNumber = numberGenerator.nextInt(10);
//        System.out.println("Random number provided by Java is: " +someRandomNumber);

        Scanner inputReader = new Scanner(System.in);
        System.out.println("Play game with me:)");

        System.out.println("Guess a number between 1 and 10");
        int userAnswer = inputReader.nextInt();
        while (userAnswer != someRandomNumber) {
            System.out.println("Guess a number between 1 and 10");
            userAnswer = inputReader.nextInt();
        }

        System.out.println("Great, You win");
    }
}
