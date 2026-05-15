// Write a program to insert an element at a specific position in an ArrayList.

import java.util.*;

public class InsertElement_108 {
    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Display original list
        System.out.println("Original List: " + fruits);

        // Insert element at index 1
        fruits.add(1, "Orange");

        // Display updated list
        System.out.println("After Inserting Element: " + fruits);
    }
}