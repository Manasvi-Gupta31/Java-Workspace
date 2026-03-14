// Find all pairs of elements from an array whose sum is equal to given number.

import java.util.Scanner;

public class PairSumFinder_53 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking size of the array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Taking array elements from user
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Taking the target sum
        System.out.print("Enter the value of X (target sum): ");
        int x = sc.nextInt();

        System.out.println("Pairs whose sum is equal to " + x + " are:");

        boolean found = false; // to check if any pair exists

        // Checking every pair in the array
        for(int i = 0; i < n; i++) {

            for(int j = i + 1; j < n; j++) {

                // If sum of two numbers equals X
                if(arr[i] + arr[j] == x) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + x);
                    found = true;
                }

            }
        }
        if(!found) {
            System.out.println("No pairs found.");
        }

        sc.close();
    }
}