// 12. Write a program to check whether the two strings are same or not in java.


import java.util.Scanner;

public class StringCompare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (str1.equals(str2)) {
            System.out.println("Both strings are same.");
        } else {
            System.out.println("Both strings are not same.");
        }

        sc.close();
    }
}
