// Write a program to remove an element from an ArrayList.

import java.util.*;

public class RemoveElement_109 {
    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // Display original list
        System.out.println("Original List: " + fruits);

        // Remove element at index 1
        fruits.remove(1);

        // Display updated list
        System.out.println("After Removing Element: " + fruits);
    }
}