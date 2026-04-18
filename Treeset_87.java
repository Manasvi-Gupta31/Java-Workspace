// Write a program to store custom objects in a TreeSet and sort them using comparator.

import java.util.*;

// Create a simple Student class
class Student {
    int id;
    String name;

    // Constructor to initialize values
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // toString method for clean printing
    public String toString() {
        return id + " - " + name;
    }
}

public class Treeset_87 {
    public static void main(String[] args) {

        // Create a TreeSet with a Comparator (sorting by id)
        TreeSet<Student> students = new TreeSet<>(new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.id - s2.id;  // sort by id (ascending)
            }
        });

        // Add student objects
        students.add(new Student(3, "Riya"));
        students.add(new Student(1, "Aman"));
        students.add(new Student(2, "Priya"));

        // Display sorted students
        System.out.println("Students sorted by ID:");

        for (Student s : students) {
            System.out.println(s);
        }
    }
}