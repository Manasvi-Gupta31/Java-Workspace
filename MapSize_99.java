//Write a program to find the size of a Map check if it is empty

import java.util.*;

public class MapSize_99 {
    public static void main(String[] args) {

        // Create a HashMap
        HashMap<Integer, String> students = new HashMap<>();

        // Add some elements
        students.put(1, "Aman");
        students.put(2, "Riya");
        students.put(3, "Priya");

        // Display the map
        System.out.println("Student Map: " + students);

        // Find the size of the map
        int size = students.size();
        System.out.println("Number of entries in the map: " + size);

        // Check if the map is empty
        if (students.isEmpty()) {
            System.out.println("The map is empty.");
        } else {
            System.out.println("The map is not empty.");
        }

        // Clear all elements
        students.clear();

        System.out.println("\nAfter clearing the map:");

        // Check again
        System.out.println("Size: " + students.size());
        System.out.println("Is map empty? " + students.isEmpty());
    }
}