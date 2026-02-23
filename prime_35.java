/*
 Write a Java program that asks the user to enter a number
 and checks whether the given number is a prime number or not.
*/

import java.util.Scanner;

class prime_35 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Ask user for a number
        System.out.print("Enter a number to check: ");
        int number = s.nextInt();

        boolean prime = true;   // assume number is prime initially

        // Numbers less than or equal to 1 are not prime
        if (number <= 1) {
            prime = false;
        } 
        else {
            // Check factors from 2 to number/2
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    prime = false;   // factor found
                    break;           // stop checking further
                }
            }
        }

        // Display result
        if (prime) {
            System.out.println("The number " + number + " is a Prime Number.");
        } else {
            System.out.println("The number " + number + " is NOT a Prime Number.");
        }

        s.close();
    }
}