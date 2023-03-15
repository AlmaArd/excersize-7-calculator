package com.sda.she_likes_java.loops.while_loop;

public class WhileGrow {
    public static void main(String[] args) {
        int ageOfTheKid = 1;

        while (ageOfTheKid <=18) {
            System.out.println("Mommy can I go to disco??");
            System.out.println("No");

//            ageOfTheKid = ageOfTheKid +1;
            ageOfTheKid++; // this is the same like in line over this one
        }
        System.out.println("I am" + ageOfTheKid + "years old, Mama: yes, go");
    }

}
