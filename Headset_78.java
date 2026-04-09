// Write a program to display elements less than a given value using headSet()

import java.util.*;

public class Headset_78 {
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

        // Define the limit value
        int limit = 35;

        // Get elements less than the given value
        SortedSet<Integer> result = numbers.headSet(limit);

        // Display the result
        System.out.println("Elements less than " + limit + ": " + result);
    }
}
