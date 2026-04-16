/* Write a program to iterate through a TreeSet using:
Iterator
Descending Iterator */

import java.util.*;

public class Treeset_85 {
    public static void main(String[] args) {

        // Create a TreeSet (elements will be stored in sorted order)
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);

        // Display the original TreeSet
        System.out.println("TreeSet elements (ascending): " + numbers);

        // Method 1: Using Iterator (ascending order)
        System.out.println("\nIterating using Iterator:");

        Iterator<Integer> itr = numbers.iterator();

        // By using for loop it can be difficult. So, we will use while loop to iterate through the TreeSet.

        while (itr.hasNext()) {
            int value = itr.next();
            System.out.println(value);
        }

        // Method 2: Using Descending Iterator

        System.out.println("\nIterating using Descending Iterator:");

        Iterator<Integer> descItr = numbers.descendingIterator();

        while (descItr.hasNext()) {
            int value = descItr.next();
            System.out.println(value);
        }
    }
}
