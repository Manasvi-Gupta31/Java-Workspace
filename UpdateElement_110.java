// Write a program to update/replace an element in an ArrayList.

import java.util.*;

public class UpdateElement_110 {
    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Display original list
        System.out.println("Original List: " + fruits);

        // Replace element at index 1
        fruits.set(1, "Orange");

        // Display updated list
        System.out.println("Updated List: " + fruits);
    }
}