// Write a program to count frequency of elements using a Map

import java.util.*;

public class FrequencyCount_102 {
    public static void main(String[] args) {

        // Array of elements
        int[] numbers = {10, 20, 10, 30, 20, 10};

        // Create a HashMap to store frequency
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Count frequency of each element
        for (int n : numbers) {

            // If element already exists, increase count
            if (frequencyMap.containsKey(n)) {
                frequencyMap.put(n, frequencyMap.get(n) + 1);
            }

            // Otherwise add element with count 1
            else {
                frequencyMap.put(n, 1);
            }
        }

        // Display frequency of elements
        System.out.println("Frequency of elements:");

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}