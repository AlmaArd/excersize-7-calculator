package com.sda.she_likes_java.loops.while_loop;

public class ForeverInLoveLoop {
    public static void main(String[] args) {
        int numberOfTrials = 0;
        while (true) {
            System.out.println("Forever in love:)");
            numberOfTrials++;

            if (numberOfTrials >= 10) {
                break;
            }
        }
    }
}
