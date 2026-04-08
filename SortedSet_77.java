import java.util.*;

public class SortedSet_77 {
    public static void main(String[] args) {

        // Create a sorted set using Treeset
        // TreeSet automatically stores elements in sorted order
        SortedSet<Integer> numbers = new TreeSet<>();

        // Insert elements into the set
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        // Display all elements (will be sorted due to Treeset)
        System.out.println("Sorted elements: " + numbers);

        // Get the first (smallest) element
        int firstElement = numbers.first();
        System.out.println("First (smallest) element: " + firstElement);

        // Get the last (largest) element
        int lastElement = numbers.last();
        System.out.println("Last (largest) element: " + lastElement);
    }
}