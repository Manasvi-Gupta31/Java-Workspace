// Write a program to reverse an ArrayList.

import java.util.*;

public class ReverseArrayList_115 {
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

        // Reverse the ArrayList
        Collections.reverse(fruits);

        // Display reversed list
        System.out.println("Reversed List: " + fruits);
    }
}