// Write a program to find the length of a String without using any inbuilt method in java.

import java.util.Scanner;

public class StringLength_46 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string: ");
        String str = s.nextLine();

        int i = 0;

        try {
            for (i = 0; ; i++) {
                str.charAt(i);
            }
        } 
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Length of the string is: " + i);
        }

        s.close();
    }
}