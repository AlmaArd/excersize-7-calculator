package com.sda.she_likes_java.loops.do_while;

public class FromDoWhileToWhileRefactoring {
    public static void main(String[] args) {
        int numberOfTrials = 3;
        do {
            System.out.println("Current value of number of Trials:" +numberOfTrials);
            numberOfTrials--;
        } while (numberOfTrials >0);

        System.out.println("Let's refactor that to while loop");
        numberOfTrials = 3;
        while (numberOfTrials >0) {
            System.out.println("While loop, number of trials: " + numberOfTrials);
            numberOfTrials--;
        }
    }
}
