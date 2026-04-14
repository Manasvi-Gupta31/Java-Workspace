/*Write a program to:

Check if a TreeSet contains a specific element
Remove it if found */

import java.util.*;

public class Treeset_83 {
    public static void main(String[] args) {

        // Create a TreeSet (stores elements in sorted order)
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add some elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Display current elements
        System.out.println("Original TreeSet: " + numbers);

        // Element we want to check
        int value = 20;

        // Check if the element exists
        if (numbers.contains(value)) {
            System.out.println(value + " is present in the TreeSet.");

            // Remove the element if found
            numbers.remove(value);
            System.out.println(value + " has been removed.");
        } else {
            System.out.println(value + " is not present in the TreeSet.");
        }

        // Display updated set
        System.out.println("Updated TreeSet: " + numbers);
    }
}