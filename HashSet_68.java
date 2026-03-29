import java.util.*;

public class HashSet_68 {
    public static void main(String[] args) {
        
        HashSet<Integer> set = new HashSet<>();

        // Adding elements (including duplicates)
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); // duplicate
        set.add(10); // duplicate

        // Printing the set
        System.out.println("HashSet elements: " + set);
    }
}