// Write a Java program to find the smallest and largest element in an array by using Math.min() and Math.max() functions.

import java.util.Scanner;

public class S_L_Array_49 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Ask user how many numbers they want to enter
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Create an array of size n
        int[] arr = new int[n];

        // Take numbers from the user and store them in the array
        for(int i = 0; i < n; i++) {
           System.out.print("Enter element " + (i+1) + ": ");
           arr[i] = sc.nextInt();
}
        int smallest = arr[0];
        int largest = arr[0];

        for (int i = 1; i < n; i++) {

            // Find the smaller value
            smallest = Math.min(smallest, arr[i]);

            // Find the larger value
            largest = Math.max(largest, arr[i]);
        }

        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);

        sc.close();
    }
}