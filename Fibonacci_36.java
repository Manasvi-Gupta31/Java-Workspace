// Print Fibonacci Series using Recursion and takes number of terms from the user

import java.util.Scanner;

class Fibonacci_36 {

    // Recursive function to calculate Fibonacci number
    static int fib(int n) {

        // base condition
        if (n <= 1) {
            return n;
        }

        // recursive call
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter the number: ");
        int terms = s.nextInt();

        System.out.println("\nFibonacci Series:");

        // printing fibonacci sequence
        for (int i = 0; i < terms; i++) {
            System.out.print(fib(i) + " ");
        }

        s.close();
    }
}