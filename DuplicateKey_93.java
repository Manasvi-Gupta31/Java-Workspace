/* Write a program to:

Add duplicate keys in a HashMap */

import java.util.*;

public class DuplicateKey_93 {
    public static void main(String[] args) {

        // Create a HashMap
        HashMap<Integer, String> students = new HashMap<>();

        // Add key-value pairs
        students.put(1, "Aman");
        students.put(2, "Riya");

        // Add duplicate key with new value
        students.put(1, "Priya");  // duplicate key

        // Display the map
        System.out.println("HashMap contents: " + students);
    }
}
