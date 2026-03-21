// Write a Java program to demonstrate the use of a static variable in a constructor to count the number of objects created.

import java.util.Scanner;

class Car_60 {

    String brand;
    double price;

    static int count = 0; // static variable

    // Constructor
    Car_60(String b, double p) {
        brand = b;
        price = p;
        count++; // increase count when object is created
    }

    void display() {
        System.out.println("Brand: " + brand + ", Price: " + price);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of cars: ");
        int n = sc.nextInt();
        sc.nextLine();

        Car_60 arr[] = new Car_60[n];

        // Taking input
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details for Car " + (i + 1) + ":");

            System.out.print("Enter brand: ");
            String brand = sc.nextLine();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            arr[i] = new Car_60(brand, price); // constructor call
        }

        // Display all cars
        System.out.println("\n Car Details ");
        for (int i = 0; i < n; i++) {
            arr[i].display();
        }

        // Display total count
        System.out.println("\nTotal Cars Created: " + Car_60.count);
    }
}