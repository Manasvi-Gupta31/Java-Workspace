// Write a program to convert a Hashset into a Sortedset print sorted output..

import java.util.*;

public class Sortedset_84 {
    public static void main(String[] args) {

        // Create a Hashset (unordered collection)
        HashSet<Integer> hashSet = new HashSet<>();

        // Add elements in random order
        hashSet.add(50);
        hashSet.add(10);
        hashSet.add(30);
        hashSet.add(20);
        hashSet.add(40);

        // Display the original HashSet
        System.out.println("Original HashSet (unordered): " + hashSet);

        // Convert HashSet to SortedSet using TreeSet
        // TreeSet will automatically sort the elements
        SortedSet<Integer> sortedSet = new TreeSet<>(hashSet);

        // Display the sorted output
        System.out.println("SortedSet (after sorting): " + sortedSet);
    }
}