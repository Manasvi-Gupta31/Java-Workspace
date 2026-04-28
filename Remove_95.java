// Write a program to remove a key-value pair from a Map.

import java.util.*;

public class Remove_95 {
    public static void main(String[] args) {

        // Create a HashMap
        HashMap<Integer, String> students = new HashMap<>();

        // Add key-value pairs
        students.put(1, "Aman");
        students.put(2, "Riya");
        students.put(3, "Priya");

        // Show original map
        System.out.println("Original Map: " + students);

        // Key we want to remove
        int key = 2;

        // Check first, then remove
        if (students.containsKey(key)) {
            students.remove(key);
            System.out.println("Key " + key + " removed successfully.");
        } else {
            System.out.println("Key " + key + " not found.");
        }

        // Show updated map
        System.out.println("Updated Map: " + students);
    }
}