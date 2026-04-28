// As we perform the last program our output is 1=Aman, 3=Priya. Now we renumber keys in order like 1=Aman, 2=Priya.

import java.util.*;

public class UpdateRemoveKey_96 {
    public static void main(String[] args) {

        // Original map
        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "Aman");
        students.put(3, "Priya");

        System.out.println("Original Map: " + students);

        // Create a new map to store updated keys
        HashMap<Integer, String> updatedMap = new HashMap<>();

        int newKey = 1;

        // Reassign keys in order
        for (String name : students.values()) {
            updatedMap.put(newKey, name);
            newKey++;
        }

        // Display updated map
        System.out.println("Updated Map: " + updatedMap);
    }
}
