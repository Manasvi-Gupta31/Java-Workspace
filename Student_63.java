// Constructor in Inheritance

import java.util.Scanner;

class Person {

    String name;
    int age;

    // Parent constructor
    Person(String n, int a) {
        name = n;
        age = a;
    }
}

class Student_63 extends Person {

    int marks;

    // Child constructor using super()
    Student_63(String n, int a, int m) {
        super(n, a); // calling parent constructor
        marks = m;
    }

    void display() {
        System.out.println("\nName  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Marks : " + marks);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        Student_63 s1 = new Student_63(name, age, marks);

        s1.display();
    }
}