// Write a Java program to check whether a given string contains only digits. 
// If the string contains only digits, reverse the digits and display the reversed result; otherwise display an appropriate message.

import java.util.Scanner;

class digit_31 {

    // Reverse function
    static String reverse(String str) {
        String rev = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        boolean is_digit = true;

        for(int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            if(s < '0' || s > '9') {
                is_digit = false;
                break;
            }
        }

        if(is_digit) {
            System.out.println("String only contains digits.");

            // Calling reverse function
            String reversed = reverse(str);
            System.out.println("Reversed digits: " + reversed);
        }
        else {
            System.out.println("String does not only contain digits.");
        }

        sc.close();
    }
}
