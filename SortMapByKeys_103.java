// Write a program to sort a Map by keys using TreeMap.

import java.util.*;

public class SortMapByKeys_103 {
    public static void main(String[] args) {

        // Create a HashMap (unordered)
        HashMap<Integer, String> students = new HashMap<>();

        // Add key-value pairs
        students.put(3, "Priya");
        students.put(1, "Aman");
        students.put(4, "Kunal");
        students.put(2, "Riya");

        // Display original map
        System.out.println("Original HashMap: " + students);

        // Convert HashMap to TreeMap
        // TreeMap automatically sorts keys
        TreeMap<Integer, String> sortedMap = new TreeMap<>(students);

        // Display sorted map
        System.out.println("Map sorted by keys: " + sortedMap);
    }
}