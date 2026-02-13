// Write a Java program to check whether a given string is a palindrome or not.

import java.util.Scanner;

class palindrome{

    public static boolean is_palindrome(String str){

        String s = str.toLowerCase();
        String rev = "";

        for(int i = 0;i<s.length();i++){
            rev = s.charAt(i) + rev;
        }

        return s.equals(rev);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to know whether it's a plindrome or not : ");
        String str = sc.next();

        boolean a = is_palindrome(str);

	// System.out.println("String is "+str);
    //     System.out.println("Reversed string is "+rev_str);

        if(a){
            System.out.println("It's a palindrome.");
        }
        else{
            System.out.println("It's not a palindrome.");
        }

    }

}