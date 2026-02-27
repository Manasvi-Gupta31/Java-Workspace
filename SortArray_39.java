// How do you sort an array in Java by taking input from user.

import java.util.Arrays;
import java.util.Scanner;

public class SortArray_39 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking size of array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // taking array input
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // sorting the array
        Arrays.sort(arr);

        // printing sorted array
        System.out.println("Sorted Array:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}