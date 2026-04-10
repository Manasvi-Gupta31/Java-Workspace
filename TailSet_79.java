// Write a program to display elements greater than or equal to a value using tailSet()

import java.util.*;

public class TailSet_79 {
    public static void main(String[] args) {

        // Create a SortedSet (TreeSet keeps elements sorted)
        SortedSet<Integer> numbers = new TreeSet<>();

        // Add some elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Display all elements
        System.out.println("All elements: " + numbers);

        // Define the starting value
        int value = 30;

        // Get elements greater than or equal to the given value
        SortedSet<Integer> result = numbers.tailSet(value);

        System.out.println("Elements greater than or equal to " + value + ": " + result);
    }
}
