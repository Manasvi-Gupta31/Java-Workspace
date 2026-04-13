// Write a Java program to create a treeset, insert elements and print them in descending order

import java.util.*;

public class Treeset_82 {
    public static void main(String[] args) {

        // Create a TreeSet to store numbers
        // By default, TreeSet stores elements in ascending order
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements in random order
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);

        // Display elements in normal (ascending) order
        System.out.println("Elements in ascending order: " + numbers);

        // Get elements in descending order
        // descendingSet() returns elements in reverse order
        Set<Integer> descendingNumbers = numbers.descendingSet();

        // Display elements in descending order
        System.out.println("Elements in descending order: " + descendingNumbers);
    }
}