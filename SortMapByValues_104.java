// Write a program to sort a Map by values.

import java.util.*;

public class SortMapByValues_104 {
    public static void main(String[] args) {

        // Create a HashMap
        HashMap<Integer, String> students = new HashMap<>();

        // Add key-value pairs
        students.put(3, "Priya");
        students.put(1, "Aman");
        students.put(4, "Kunal");
        students.put(2, "Riya");

        // Display original map
        System.out.println("Original Map: " + students);

        // Convert map entries into a list
        List<Map.Entry<Integer, String>> list =
                new ArrayList<>(students.entrySet());

        // Sort the list based on values
        list.sort(Map.Entry.comparingByValue());

        // Display sorted result
        System.out.println("\nMap sorted by values:");

        for (Map.Entry<Integer, String> entry : list) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}