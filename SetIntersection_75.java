// Write a Java program to find intersection of two sets.

import java.util.*;

public class SetIntersection_75 {
    public static void main(String[] args) {

        // Create first set and add elements
        Set<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);

        // Create second set and add elements
        Set<Integer> set2 = new HashSet<>();
        set2.add(20);
        set2.add(30);
        set2.add(40);

        // Display both sets
        System.out.println("First Set: " + set1);
        System.out.println("Second Set: " + set2);

        // Create a new set to store intersection result
        Set<Integer> intersectionSet = new HashSet<>(set1);

        // Keep only common elements (present in both sets)
        intersectionSet.retainAll(set2);

        // Display the intersection result
        System.out.println("Common elements (Intersection): " + intersectionSet);
    }
}