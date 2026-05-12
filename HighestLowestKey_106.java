// Write a program to find the highest and lowest key in a TreeMap.

import java.util.*;

public class HighestLowestKey_106 {
    public static void main(String[] args) {

        // Create a TreeMap (keys are stored in sorted order)
        TreeMap<Integer, String> students = new TreeMap<>();

        // Add key-value pairs
        students.put(3, "Priya");
        students.put(1, "Aman");
        students.put(4, "Kunal");
        students.put(2, "Riya");

        // Display the map
        System.out.println("TreeMap: " + students);

        // Find lowest and highest keys
        int lowestKey = students.firstKey();
        int highestKey = students.lastKey();

        // Display results
        System.out.println("Lowest Key: " + lowestKey);
        System.out.println("Highest Key: " + highestKey);
    }
}