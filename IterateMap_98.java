/* Write a program to iterate through a Map using:
keySet()
entrySet()  */

import java.util.*;

public class IterateMap_98 {
    public static void main(String[] args) {

        // Create a HashMap
        HashMap<Integer, String> students = new HashMap<>();

        // Add key-value pairs
        students.put(1, "Aman");
        students.put(2, "Riya");
        students.put(3, "Priya");

        // Display the map
        System.out.println("Student Map: " + students);

        // Method 1: Using keySet()
        System.out.println("\nUsing keySet():");

        for (Integer key : students.keySet()) {
            System.out.println("ID: " + key + ", Name: " + students.get(key));
        }

        // Method 2: Using entrySet()
        System.out.println("\nUsing entrySet():");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}