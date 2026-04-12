// Write a program to sort strings in a treesetand print them in alphabetical order

import java.util.*;

public class Setstring_81 {
    public static void main(String[] args) {

        // Create a TreeSet to store strings
        // TreeSet automatically sorts elements in alphabetical order
        TreeSet<String> names = new TreeSet<>();

        // Add some names (in random order)
        names.add("Riya");
        names.add("Aman");
        names.add("Priya");
        names.add("Kunal");

        // Display the sorted names
        System.out.println("Names in alphabetical order: " + names);
    }
}
