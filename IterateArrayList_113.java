/* Write a program to:

Iterate through an ArrayList
using for loop
using for-each loop */

import java.util.*;

public class IterateArrayList_113 {
    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Display the list
        System.out.println("Fruit List: " + fruits);

        // Using normal for loop
        System.out.println("\nUsing for loop:");

        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // Using for-each loop
        System.out.println("\nUsing for-each loop:");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}