// Find a Pair Whose Sum is Closest to zero in Array by Brute Force.

import java.util.Scanner;

public class ClosestSum_52 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int minSum = Integer.MAX_VALUE;
        int a = 0, b = 0;

        // checking every pair
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {

                int sum = arr[i] + arr[j];

                if(Math.abs(sum) < Math.abs(minSum)) {
                    minSum = sum;
                    a = arr[i];
                    b = arr[j];
                }
            }
        }

        System.out.println("Pair closest to zero: " + a + " and " + b);
        System.out.println("Sum: " + minSum);
    }
}