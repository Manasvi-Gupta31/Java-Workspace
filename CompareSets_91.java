// Write a program to compare HashSet and TreeSet output for the same input.

import java.util.*;

public class CompareSets_91 {
    public static void main(String[] args) {

        // Create a HashSet (no order)
        HashSet<Integer> hashSet = new HashSet<>();

        // Create a TreeSet (sorted order)
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Same input values
        int[] values = {40, 10, 30, 20, 10};

        // Add values to both sets
        for (int v : values) {
            hashSet.add(v);
            treeSet.add(v);
        }

        // Display outputs
        System.out.println("HashSet output (unordered): " + hashSet);
        System.out.println("TreeSet output (sorted): " + treeSet);
    }
}