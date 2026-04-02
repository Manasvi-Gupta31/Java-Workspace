import java.util.*;

public class RemoveDuplicates_71 {
    public static void main(String[] args) {

        // Create a list that contains some duplicate numbers
        ArrayList<Integer> originalList = new ArrayList<>();
        originalList.add(10);
        originalList.add(20);
        originalList.add(30);
        originalList.add(20); // duplicate value
        originalList.add(10); // duplicate value

        // Show the list before removing duplicates
        System.out.println("Original List (with duplicates): " + originalList);

        // Convert the list into a HashSet to remove duplicates
        Set<Integer> uniqueValues = new HashSet<>(originalList);

        // Display the result after removing duplicates
        System.out.println("List after removing duplicates: " + uniqueValues);
    }
}