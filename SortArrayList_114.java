// Write a program to sort an ArrayList.

import java.util.*;

public class SortArrayList_114 {
    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Display original list
        System.out.println("Original List: " + fruits);

        // Sort the ArrayList
        Collections.sort(fruits);

        // Display sorted list
        System.out.println("Sorted List: " + fruits);
    }
}