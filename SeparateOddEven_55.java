// Write a program to separate odd and even numbers in an array.

import java.util.Scanner;

public class SeparateOddEven_55 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] result = new int[n];

        System.out.println("Enter elements:");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int index = 0;

        // store even numbers
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 == 0){
                result[index++] = arr[i];
            }
        }

        // store odd numbers
        for(int i = 0; i < n; i++){
            if(arr[i] % 2 != 0){
                result[index++] = arr[i];
            }
        }

        System.out.println("After separating:");

        for(int i = 0; i < n; i++){
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}