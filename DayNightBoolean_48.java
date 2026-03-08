// Write a Java program that takes user input as true or false to indicate whether the sun is up or not.
// Based on that input, prints Day or Night.

import java.util.Scanner;

public class DayNightBoolean_48 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter true or false: ");

        String input = sc.next();

        if(input.equals("true") || input.equals("false")) {

            boolean IsSunUp = Boolean.parseBoolean(input);

            if(IsSunUp)
                System.out.printf("Day");
            else
                System.out.println("Night");

        } else {
            System.out.println("Invalid input");
        }
    }
}