// Write a program to compare HashMap and TreeMap output.

import java.util.*;

public class CompareMaps_107 {
    public static void main(String[] args) {

        // Create a HashMap (unordered)
        HashMap<Integer, String> hashMap = new HashMap<>();

        // Input values
        hashMap.put(3, "Priya");
        hashMap.put(1, "Aman");
        hashMap.put(4, "Kunal");
        hashMap.put(2, "Riya");

        // Display outputs
        System.out.println("HashMap Output:");
        System.out.println(hashMap);

         // Create a TreeMap (sorted by keys)
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Same input values
        treeMap.put(3, "Priya");
        treeMap.put(1, "Aman");
        treeMap.put(4, "Kunal");
        treeMap.put(2, "Riya");

        System.out.println("\nTreeMap Output:");
        System.out.println(treeMap);
    }
}