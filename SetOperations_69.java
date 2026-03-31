// Write a program to remove an element from a Set and check if an element exists using contains()

import java.util.*;

public class SetOperations_69 {
    public static void main(String[] args) {
        
        Set<Integer> set = new HashSet<>();

        // Adding elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println("Original Set: " + set);

        // Removing an element
        set.remove(20);
        System.out.println("After removing 20: " + set);

        // Checking if element exists
        if (set.contains(30)) {
            System.out.println("30 is present in the set");
        } else {
            System.out.println("30 is not present in the set");
        }
    }
}