// Write a program to replace a value for a given key.

import java.util.*;

public class ReplaceValue_100 {
    public static void main(String[] args) {

        // Create a HashMap
        HashMap<Integer, String> students = new HashMap<>();

        // Add key-value pairs
        students.put(1, "Aman");
        students.put(2, "Riya");
        students.put(3, "Priya");

        // Show original map
        System.out.println("Original Map: " + students);

        // Key whose value we want to update
        int key = 2;

        // New value
        String newValue = "Kunal";

        // Replace value if key exists
        if (students.containsKey(key)) {
            students.replace(key, newValue);
            System.out.println("Value updated for key " + key);
        } else {
            System.out.println("Key not found");
        }

        // Show updated map
        System.out.println("Updated Map: " + students);
    }
}