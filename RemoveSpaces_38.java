// Program to remove spaces from a string using user input

import java.util.Scanner;

class RemoveSpaces_38 {
    public static void main(String[] args) {

        // taking input from user
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = s.nextLine();

        // removing spaces from the string
        str = str.replace(" ", "");

        // printing result
        System.out.println("String after removing spaces: " + str);

        s.close();
    }
}