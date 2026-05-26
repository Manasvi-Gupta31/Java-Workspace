// Write a program to sort a LinkedList.

import java.util.*;

public class SortLinkedList_119 {
    public static void main(String[] args) {

        // Create a LinkedList
        LinkedList<String> fruits = new LinkedList<>();

        // Add elements
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");

        // Display original list
        System.out.println("Original LinkedList: " + fruits);

        // Sort the LinkedList
        Collections.sort(fruits);

        // Display sorted list
        System.out.println("Sorted LinkedList: " + fruits);
    }
}