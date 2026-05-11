// Write a program to store custom objects in a Map.

import java.util.*;

// Create a simple Student class
class Student {
    int id;
    String name;

    // Constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class ObjectMap_105 {
    public static void main(String[] args) {

        // Create a HashMap
        // Key = Integer, Value = Student object
        HashMap<Integer, Student> students = new HashMap<>();

        // Add custom objects into the map
        students.put(1, new Student(101, "Aman"));
        students.put(2, new Student(102, "Riya"));
        students.put(3, new Student(103, "Priya"));

        // Display map contents
        System.out.println("Student Details:");

        for (Map.Entry<Integer, Student> entry : students.entrySet()) {

            Student s = entry.getValue();

            System.out.println(
                "Key: " + entry.getKey() +
                ", ID: " + s.id +
                ", Name: " + s.name
            );
        }
    }
}