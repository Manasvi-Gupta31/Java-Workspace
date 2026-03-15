//  Give an array of 0’s and 1’s in random order, you need to separate 0’s and 1’s in an array.

import java.util.Scanner;

public class SeparateZeroOne_54 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user for number of elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Taking array input
        System.out.println("Enter element one by one (only 0 or 1):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int countZero = 0;

        // Count number of 0's
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                countZero++;
            }
        }

        // Fill array with 0's first
        for (int i = 0; i < countZero; i++) {
            arr[i] = 0;
        }

        // Fill remaining positions with 1's
        for (int i = countZero; i < n; i++) {
            arr[i] = 1;
        }

        // Print the updated array
        System.out.println("Array after separating 0s and 1s:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}