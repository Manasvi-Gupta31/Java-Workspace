// Write a program to convert ArrayList into LinkedList.

import java.util.*;

public class ConvertList_117 {
    public static void main(String[] args) {

        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Display ArrayList
        System.out.println("ArrayList: " + fruits);

        // Convert ArrayList into LinkedList
        LinkedList<String> fruitList = new LinkedList<>(fruits);

        // Display LinkedList
        System.out.println("LinkedList: " + fruitList);
    }
}
