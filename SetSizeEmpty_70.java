import java.util.*;

public class SetSizeEmpty_70 {
    public static void main(String[] args) {

        // Create a Set to store some names
        Set<String> names = new HashSet<>();

        // Add a few elements into the set
        names.add("Aman");
        names.add("Riya");
        names.add("Priya");

        // Print the current elements of the set
        System.out.println("Set elements: " + names);

        // Find and display the number of elements
        int totalElements = names.size();
        System.out.println("Number of elements in the set: " + totalElements);

        // Check whether the set is empty or not
        if (names.isEmpty()) {
            System.out.println("The set is empty.");
        } else {
            System.out.println("The set is not empty.");
        }

        // Now remove all elements from the set
        names.clear();

        System.out.println("\nAfter clearing the set:");

        // Again check size and emptiness
        System.out.println("Number of elements: " + names.size());

        if (names.isEmpty()) {
            System.out.println("The set is empty.");
        } else {
            System.out.println("The set still has elements.");
        }
    }
}