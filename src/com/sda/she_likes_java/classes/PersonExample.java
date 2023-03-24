package com.sda.she_likes_java.classes;

public class PersonExample {
    public static void main(String[] args) {
        System.out.println("Let's use our newly created class person");
        // number is primitive variable
        int number = 1;
        String name = "Alma";
        String empty = "";
        String nullString = null;
        nullString = "aha";

        // me is object variable
        Person me = new Person();
        me.name = "Alma";
        Person You = new Person();
        You.name = "Agnese";

        System.out.println("My name is: " +me.name);
        System.out.println("Your name is: " +You.name);

        // me - object; name - value


    }
}
