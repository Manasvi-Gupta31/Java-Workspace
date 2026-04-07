// Write a Java program to find difference between two sets.

import java.util.*;

public class SetDifference_76 {
    public static void main(String[] args) {

        // Create first set and add elements
        Set<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);

        // Create second set and add elements
        Set<Integer> set2 = new HashSet<>();
        set2.add(20);
        set2.add(40);
        set2.add(50);

        // Display both sets
        System.out.println("First Set: " + set1);
        System.out.println("Second Set: " + set2);

        // Create a new set to store the difference result
        Set<Integer> differenceSet = new HashSet<>(set1);

        // Remove elements that are also present in set 2
        differenceSet.removeAll(set2);

        // Display the result
        System.out.println("Elements in Set1 but not in Set2: " + differenceSet);
    }
}
