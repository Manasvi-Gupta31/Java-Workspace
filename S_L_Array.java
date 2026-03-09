// Write java Program to Find Smallest and Largest Element in an Array.
// by using Sort the array method

import java.util.Arrays;
import java.util.Scanner;

public class S_L_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user for the number of elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Taking array input from the user
        try {
            for(int i = 0; i < n; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }
        } 
        catch (Exception e) {
            // This will run if user enters something other than integer
            System.out.println("Invalid input! Please enter only integers.");
            return; // stop program if error occurs
        }

        // Sorting the array
        Arrays.sort(arr);

        // Smallest and largest elements after sorting
        int smallest = arr[0];
        int largest = arr[n - 1];

        // Display result
        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);

        sc.close();
    }
}