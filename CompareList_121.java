// Write a program to compare ArrayList and LinkedList output.

import java.util.*;

public class CompareList_121 {
    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Add elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Mango");

        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add same elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Mango");

        // Display ArrayList
        System.out.println("ArrayList Output:");
        System.out.println(arrayList);

        // Display LinkedList
        System.out.println("\nLinkedList Output:");
        System.out.println(linkedList);
    }
}