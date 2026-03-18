// Constructor Overloading

import java.util.Scanner;

class Student_57 {

    String name;
    int age;
    String course;

    // Default Constructor
    Student_57() {
    }

    // Constructor with 2 parameters
    Student_57(String n, int a) {
        name = n;
        age = a;
        course = "Not Assigned";
    }

    // Constructor with 3 parameters
    Student_57(String n, int a, String c) {
        name = n;
        age = a;
        course = c;
    }

    // Method to take input
    void takeInput(Scanner sc) {
        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter course: ");
        course = sc.nextLine();
    }

    // Display method
    void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Course : " + course);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Student 1
        System.out.println("Enter details for Student 1:");
        Student_57 s1 = new Student_57();
        s1.takeInput(sc);

        // Student 2
        System.out.println("\nEnter details for Student 2:");
        System.out.print("Enter name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter age: ");
        int age2 = sc.nextInt();
        sc.nextLine();

        Student_57 s2 = new Student_57(name2, age2);

        // Student 3
        System.out.println("\nEnter details for Student 3:");
        System.out.print("Enter name: ");
        String name3 = sc.nextLine();

        System.out.print("Enter age: ");
        int age3 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter course: ");
        String course3 = sc.nextLine();

        Student_57 s3 = new Student_57(name3, age3, course3);

        // Display
        s1.display();
        s2.display();
        s3.display();
    }
}