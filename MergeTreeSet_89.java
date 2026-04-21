// Write a program to merge two TreeSets and maintain sorted order.

import java.util.*;

public class MergeTreeSet_89 {
    public static void main(String[] args) {

        // Create first TreeSet
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(10);
        set1.add(30);
        set1.add(50);

        // Create second TreeSet
        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(20);
        set2.add(40);
        set2.add(60);

        // Display both sets
        System.out.println("First TreeSet: " + set1);
        System.out.println("Second TreeSet: " + set2);

        // Merge both sets
        TreeSet<Integer> mergedSet = new TreeSet<>(set1);
        mergedSet.addAll(set2);

        // Display merged result (automatically sorted)
        System.out.println("Merged TreeSet (sorted): " + mergedSet);
    }
}