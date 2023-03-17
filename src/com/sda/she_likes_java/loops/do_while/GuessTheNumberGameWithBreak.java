package com.sda.she_likes_java.loops.do_while;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGameWithBreak {
    public static void main(String[] args) {
        Random numberGenerator = new Random();
        int someRandomNumber = numberGenerator.nextInt(20);
        int numberOfTrials = 8;
        System.out.println("Random number provided by Java is: " +someRandomNumber);

        Scanner inputReader = new Scanner(System.in);
        int userAnswer;
        System.out.println("Play game with me:)");
        do {
            if (numberOfTrials <= 0) {
                break;
            }
        System.out.println("Guess a number between 1 and 20");
        userAnswer = inputReader.nextInt();
        numberOfTrials--;
        } while (userAnswer != someRandomNumber);

        System.out.println("Great, You win");
    }
}
