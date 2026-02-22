// Write a java program to check if two Strings are anagram in java

// An anagram of a string is another string that contains the same characters, 
// only the order of characters can be different.
// For example, "abcd" and "dabc" are an anagram of each other.
/*
Example:
listen  -> silent   (Anagram)
hello   -> world    (Not Anagram)
*/

import java.util.Arrays;
import java.util.Scanner;

public class Anagram_34 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter first string: ");
        String first = sc.nextLine();

        System.out.print("Enter second string: ");
        String second = sc.nextLine();

        // Converting both strings to lowercase and removing spaces
        first = first.replaceAll("\\s", "").toLowerCase();
        second = second.replaceAll("\\s", "").toLowerCase();

        // Converting strings into character arrays
        char[] arr1 = first.toCharArray();
        char[] arr2 = second.toCharArray();

        // Sorting both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Checking equality
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Both strings are Anagrams.");
        } 
        else {
            System.out.println("Both strings are not Anagrams.");
        }

        sc.close();
    }
}