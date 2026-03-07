// Write a program to print all permutations in java.

import java.util.Scanner;

public class Permutations_47 {

    // Recursive method to generate permutations
    public static void generatePermutation(String str, String result) {

        // It tells the program when to stop the recursive process and print a permutation.
        if (str.length() == 0) {
            System.out.println(result);
            return;
        }

        // Pick each character one by one
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);

            // Recursive call
            generatePermutation(remaining, result + ch);
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = s.nextLine();

        // Check only if input is empty
        if (input.isEmpty()) {
            System.out.println("Error: You must enter something.");
            return;
        }

        System.out.println("\nPermutations are:");
        generatePermutation(input, "");

        s.close();
    }
}