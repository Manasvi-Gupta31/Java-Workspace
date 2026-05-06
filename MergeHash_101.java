// Write a program to merge two HashMaps.

import java.util.*;

public class MergeHash_101 {
    public static void main(String[] args) {

        // Create first HashMap
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Aman");
        map1.put(2, "Riya");

        // Create second HashMap
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(3, "Priya");
        map2.put(4, "Kunal");

        // Display both maps
        System.out.println("First Map: " + map1);
        System.out.println("Second Map: " + map2);

        // Merge map2 into map1
        map1.putAll(map2);

        // Display merged map
        System.out.println("Merged Map: " + map1);
    }
}