import java.util.*;

public class TreeSet_72 {
    public static void main(String[] args) {

        // Create a TreeSet to store numbers
        // TreeSet automatically keeps elements in sorted order
        TreeSet<Integer> numbers = new TreeSet<>();

        // Adding elements in random (unsorted) order
        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        // Display the elements after insertion
        // Output will always be sorted due to tree set
        System.out.println("Numbers stored in sorted order: " + numbers);
    }
}