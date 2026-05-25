// Write a program to merge two LinkedLists.

import java.util.*;

public class MergeLinkedList_118 {
    public static void main(String[] args) {

        // Create first LinkedList
        LinkedList<String> list1 = new LinkedList<>();

        list1.add("Apple");
        list1.add("Banana");

        // Create second LinkedList
        LinkedList<String> list2 = new LinkedList<>();

        list2.add("Mango");
        list2.add("Orange");

        // Display both lists
        System.out.println("First LinkedList: " + list1);
        System.out.println("Second LinkedList: " + list2);

        // Merge second list into first list
        list1.addAll(list2);

        // Display merged list
        System.out.println("Merged LinkedList: " + list1);
    }
}