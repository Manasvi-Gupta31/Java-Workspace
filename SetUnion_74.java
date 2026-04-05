import java.util.*;

public class SetUnion_74 {
    public static void main(String[] args) {

        // Create first set and add elements
        Set<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);

        // Create second set and add elements
        Set<Integer> set2 = new HashSet<>();
        set2.add(30);
        set2.add(40);
        set2.add(50);

        // Display both sets
        System.out.println("First Set: " + set1);
        System.out.println("Second Set: " + set2);

        // Create a new set to store union result
        Set<Integer> unionSet = new HashSet<>(set1);

        // Add all elements of second set into first
        // Duplicate elements will be ignored automatically
        unionSet.addAll(set2);

        // Display the union result
        System.out.println("Union of both sets: " + unionSet);
    }
}