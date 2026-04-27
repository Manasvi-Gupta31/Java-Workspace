// Write a program to retrieve value using a key (get() method).

import java.util.*;

public class GetValue_94 {
    public static void main(String[] args) {

        // Create a HashMap
        HashMap<Integer, String> students = new HashMap<>();

        // Add key-value pairs (id → name)
        students.put(1, "Aman");
        students.put(2, "Riya");
        students.put(3, "Priya");

        // Key we want to search
        int key = 2;

        // Retrieve value using get()
        String value = students.get(key);

        // Display result
        System.out.println("Value for key " + key + ": " + value);
    }
}