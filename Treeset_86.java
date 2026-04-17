/* Write a program to find the ceiling and floor element in a TreeSet */

import java.util.*;

public class Treeset_86 {
    public static void main(String[] args) {

        // Create a TreeSet (stores elements in sorted order)
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Display the TreeSet
        System.out.println("TreeSet elements: " + numbers);

        int value = 25;

        // Find ceiling and floor
        Integer ceilingValue = numbers.ceiling(value);
        Integer floorValue = numbers.floor(value);

        // Display results
        System.out.println("Given value: " + value);
        System.out.println("Ceiling value: " + ceilingValue);
        System.out.println("Floor value: " + floorValue);
    }
}