// Search an element in rotated array in java and make the array sorted.

import java.util.Arrays;
import java.util.Scanner;

public class Array_50 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user for number of elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Take array input
        System.out.println("Enter rotated array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array
        Arrays.sort(arr);

        // Show the sorted array
        System.out.println("Sorted array:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Ask which element to search
        System.out.print("\nEnter element to search: ");
        int key = sc.nextInt();

        int index = -1;

        for(int i = 0; i < n; i++) {
            if(arr[i] == key) {
                index = i;
                break;
            }
        }

        // Print result
        if(index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}