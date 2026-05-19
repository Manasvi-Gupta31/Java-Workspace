// Write a program to search for an element using contains().

import java.util.*;

public class SearchElement_112 {
    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Display the list
        System.out.println("Fruit List: " + fruits);

        // Element to search
        String searchItem = "Banana";

        // Check if element exists
        if (fruits.contains(searchItem)) {
            System.out.println(searchItem + " is present in the list.");
        } else {
            System.out.println(searchItem + " is not present in the list.");
        }
    }
}