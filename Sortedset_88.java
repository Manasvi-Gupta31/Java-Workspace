// Write a program to remove elements from a Sortedset that are below a threshold value.

import java.util.*;

public class Sortedset_88 {
    public static void main(String[] args) {

        // Create a SortedSet (TreeSet keeps elements sorted)
        SortedSet<Integer> numbers = new TreeSet<>();

        // Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Show original set
        System.out.println("Original Set: " + numbers);

        // Set the threshold value
        int threshold = 30;

        // Remove elements less than threshold
        //numbers.removeIf(n -> n < threshold);     or we can use headSet to get all elements less than threshold and clear them
        numbers.headSet(threshold).clear();

        // Show updated set
        System.out.println("After removing elements below " + threshold + ": " + numbers);
    }
}
