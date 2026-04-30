// Write a program to check if a key or value exists in a Map

import java.util.*;

public class CheckKeyValue_97 {
    public static void main(String[] args) {

        // Create a HashMap
        HashMap<Integer, String> students = new HashMap<>();

        // Add key-value pairs
        students.put(1, "Aman");
        students.put(2, "Riya");
        students.put(3, "Priya");

        // Show the map
        System.out.println("Student Map: " + students);

        // Key and value to check
        int key = 2;
        String value = "Priya";

        // Check if key exists
        if (students.containsKey(key)) {
            System.out.println("Key " + key + " is present in the map.");
        } else {
            System.out.println("Key " + key + " is not present.");
        }

        // Check if value exists
        if (students.containsValue(value)) {
            System.out.println("Value \"" + value + "\" is present in the map.");
        } else {
            System.out.println("Value \"" + value + "\" is not present.");
        }
    }
}