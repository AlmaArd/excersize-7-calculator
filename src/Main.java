public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // 100 it's number literal (just value)
        System.out.println(10000000);

        // variable:
        // holder for data
        // needs good name e.g. myDaughterAge
        // needs type of variable
        // that data type limit possible set of allowed values
        // int - integer numbers
        int myDaughterAge = 5;

        // assigning new value to variable
        myDaughterAge = 6;
        // sout + enter
        System.out.println(myDaughterAge);

        // use camel case starting with lower letter
        // String type is for words and letters
        String myName = "Mariusz";
        String mySurname = "Pastuszka";
        System.out.println(myName + "-" + mySurname);

        String five = "5";
        String otherFive = "5";
        System.out.println(five + otherFive);

        // true and false
        boolean trueValue = true;
        trueValue = false;

        System.out.println(trueValue);

        // 11.0
        int eleven = 11;

        // double type for number with fraction part
        double trueEleven = 11.0;

        System.out.println("Exercise 7");
        int sum = 5 + 8;
        System.out.println("Sum of 5 and 8 is = " + sum);

        int difference = 11 - 4;
        System.out.println("Difference of 11 and 4 is: " + difference);

        int product = 5 * 8;
        System.out.println("Product of 5 and 8 is: " + product);

        double quotient = 5.0/8.5;
        System.out.println("Quotient of 5.0 and 8.5 is: " + quotient);
    }
}