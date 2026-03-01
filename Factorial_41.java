// Write a Java program to find the factorial of a number by taking input from the user.

import java.util.Scanner;

public class Factorial_41 {

    public static void main(String[] args) {

        // Scanner object to take input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        long factorial = 1;   // variable to store factorial value

        // loop to calculate factorial
        for (long i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial = " + factorial);

        sc.close();
    }
}