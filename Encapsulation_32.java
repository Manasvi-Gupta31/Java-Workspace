/*
Question:
Write a Java program to demonstrate Encapsulation.
Create a class Person with a private data member age.
Use getter and setter methods to access and modify age.
Take age input from the user and display it using getter method.
*/

import java.util.Scanner;

class Person {
    private int age;

    // Getter method
    int get_age() {
        return age;
    }

    // Setter method
    void set_age(int age) {
        this.age = age;
    }
}

class Encapsulation_32 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Person p1 = new Person();

        // Taking input from user
        System.out.print("Enter age: ");
        int userAge = sc.nextInt();

        // Setter
        p1.set_age(userAge);

        // Getter
        System.out.println("Age : " + p1.get_age());

        sc.close();
    }
}