import java.util.*;

public class SetIteration_73 {
    public static void main(String[] args) {

        // Create a Set and add some elements
        Set<String> names = new HashSet<>();
        names.add("Aman");
        names.add("Riya");
        names.add("Priya");
        names.add("Kunal");

        // Display original set
        System.out.println("Set elements: " + names);

        // Method 1: Using Iterator
        System.out.println("\nIterating using Iterator:");

        Iterator<String> itr = names.iterator();

        // Loop through the set using iterator
        while (itr.hasNext()) {
            String name = itr.next();
            System.out.println(name);
        }

        // Method 2: Using for-each loop
        System.out.println("\nIterating using for-each loop:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}