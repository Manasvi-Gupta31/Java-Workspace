// Write a program with the help of Copy Constructor

import java.util.Scanner;

class Book_58 {

    String title;
    double price;

    // Parameterized Constructor
    Book_58 (String t, double p) {
        title = t;
        price = p;
    }

    // Copy Constructor
    Book_58 (Book_58 b) {
        title = b.title;
        price = b.price;
    }

    // Display method
    void display() {
        System.out.println("\n--- Book Details ---");
        System.out.println("Title : " + title);
        System.out.println("Price : " + price);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for Book 1:");
        System.out.print("Enter title: ");
        String t = sc.nextLine();

        System.out.print("Enter price: ");
        double p = sc.nextDouble();

        // Create first object
        Book_58 b1 = new Book_58(t, p);

        // Create second object using copy constructor
        Book_58 b2 = new Book_58(b1);

        // Display both objects
        System.out.println("\nBook 1:");
        b1.display();

        System.out.println("\nBook 2 (Copied):");
        b2.display();
    }
}
