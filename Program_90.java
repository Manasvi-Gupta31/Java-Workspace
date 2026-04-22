import java.util.*;

public class Program_90 {
    public static void main(String[] args) {

        // Create a TreeSet (automatically sorted)
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);

        // Display the set
        System.out.println("TreeSet elements: " + numbers);

        // Find lowest element
        int lowest = 0;

        for (int n : numbers) {
            lowest = n;   // first element encountered will be smallest
            break;
        }

        // Find highest element
        int highest = 0;

        for (int n : numbers) {
            highest = n;  // keeps updating → last value will be largest
        }

        // Display results
        System.out.println("Lowest element: " + lowest);
        System.out.println("Highest element: " + highest);
    }
}