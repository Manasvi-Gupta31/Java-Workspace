// Write a Java program to read an integer n from the user, create an integer array of size n, accept elements into the array, 
// and display the value of n and the first element of the array.

import java.util.Scanner;
public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello");
        int n;
        System.out.println("Enter the value of  n");
        n = sc.nextInt();
        int [] arr= new int[n];
        System.out.println("Enter elements in array");
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The value of n is: " + n);
        System.out.println("The first value is: " + arr[0]);
        sc.close();
    }
}

