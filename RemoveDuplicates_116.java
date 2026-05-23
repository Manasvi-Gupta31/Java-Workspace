// Write a program to remove duplicate elements from an ArrayList.

import java.util.*;

public class RemoveDuplicates_116 {
    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements with duplicates
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");

        // Display original list
        System.out.println("Original List: " + fruits);

        // Convert ArrayList to HashSet
        // HashSet automatically removes duplicates
        HashSet<String> uniqueFruits = new HashSet<>(fruits);

        // Convert back to ArrayList
        ArrayList<String> updatedList = new ArrayList<>(uniqueFruits);

        // Display updated list
        System.out.println("List after removing duplicates: " + updatedList);
    }
}