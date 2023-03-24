package com.sda.she_likes_java.strings;

public class StringsEcxample {
    public static void main(String[] args) {
        String name = "Alma";
        String surname = "Ardaravičiūtė";
        int age = 39;

        // Hi, I'm (name) (surname). I am (age) old
        System.out.println("Hi, I'm " + name + " " + surname + ". I am " + age + " years old");
        // %s means String wildcard
        // %d means number wildcard
        System.out.println(String.format(" Hi, I'm %s %s. I am %s years old." ,name, surname, age));

        System.out.println(" Hi, I'm %s %s. I am %s years old." .formatted(name, surname, age));

        // formated works the same way as string format, just not calling function and arguments after
    }
}
