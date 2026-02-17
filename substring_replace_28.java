// Write a program to replace a substring entered by the user

import java.util.Scanner;

public class substring_replace_28 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking original string input
        System.out.print("Enter the main string: ");
        String mainStr = sc.nextLine();

        // Substring to be replaced
        System.out.print("Enter substring to replace: ");
        String oldSub = sc.nextLine();

        // New substring
        System.out.print("Enter new substring: ");
        String newSub = sc.nextLine();

        // Replacing substring
        String result = mainStr.replace(oldSub, newSub);

        // Display result
        System.out.println("Updated string: " + result);

        sc.close();
    }
}
