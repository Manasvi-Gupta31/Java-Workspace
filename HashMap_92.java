// Write a Java program to create a HashMap, add key-value pairs print all entries.

import java.util.*;

public class HashMap_92 {
    public static void main(String[] args) {

        // Create a HashMap (stores key-value pairs)
        HashMap<Integer, String> students = new HashMap<>();

        // Add key-value pairs (id → name)
        students.put(1, "Aman");
        students.put(2, "Riya");
        students.put(3, "Priya");
        students.put(4, "Kunal");

        // Display the whole map
        System.out.println("Student Map: " + students);

        // Print each entry clearly
        System.out.println("\nPrinting each key-value pair:");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}