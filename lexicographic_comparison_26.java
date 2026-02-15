//  Write a Java program to perform lexicographical comparison of two strings entered by the user.

import java.util.Scanner;

public class lexicographic_comparison_26{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str1 = sc.nextLine();
        System.out.print("Enter a string : ");
        String str2 = sc.nextLine();
        
        int lexico = str1.compareTo(str2);
	System.out.println("String comparison lexicographically.");
        if(lexico == 0){
            System.out.println(str1+" and "+str2+" both are same.");
        }
        else if(lexico > 0){
            System.out.println(str1+" is greater than "+str2+" .");
        }
        else{
            System.out.println(str2+" is greater than "+str1+".");
        }
        
        sc.close();
        
    }
    
}