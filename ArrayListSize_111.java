// Write a program to find the size of an ArrayList and check if it is empty.

import java.util.*;

public class ArrayListSize_111 {
    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Display the list
        System.out.println("Fruit List: " + fruits);

        // Find size of the ArrayList
        int size = fruits.size();

        // Display size
        System.out.println("Size of ArrayList: " + size);

        // Check if list is empty
        if (fruits.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }
    }
}