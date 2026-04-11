import java.util.*;

public class Subset_80 {
    public static void main(String[] args) {

        // Create a SortedSet (TreeSet keeps elements sorted automatically)
        SortedSet<Integer> numbers = new TreeSet<>();

        // Add some elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Display all elements
        System.out.println("All elements: " + numbers);

        // Define the range
        int start = 20;
        int end = 40;

        // Get elements within the range
        // Note: start is included, end is not included
        SortedSet<Integer> result = numbers.subSet(start, end);

        // Display the result
        System.out.println("Elements between " + start + " and " + end + ": " + result);
    }
}