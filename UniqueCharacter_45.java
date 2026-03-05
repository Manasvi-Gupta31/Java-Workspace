// Write a java program that accepts a string from the user and checks whether the string contains unique characters using a HashSet.

import java.util.HashSet;
import java.util.Scanner;

public class UniqueCharacter_45 {

    public static void main(String[] args) {

        // Creating Scanner object to take input from user
        Scanner s = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a string: ");
        String text = s.nextLine();

        // HashSet is used to store characters and automatically avoid duplicates
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            // If character already exists in the set, it means duplicate found
            if (set.contains(ch)) {
                System.out.println("String does not have all unique characters");
                return; // stop the program once duplicate is found
            }

            // Add the character to the set
            set.add(ch);
        }

        // If loop finishes without finding duplicates
        System.out.println("String has all unique characters");

        s.close();
    }
}