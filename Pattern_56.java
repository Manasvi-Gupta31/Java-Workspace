// Write a Program to print a Star(*) Pattern.

import java.util.Scanner;
class Pattern_56 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        //Input from user 
        System.out.println("Pattern type that will be printed: \n");
        System.out.println("*\n* *\n* * *\n");
        System.out.print("Enter the number of rows you want for the given pattern : ");
        int num = sc.nextInt();
        
        //Printing the pattern
        for(int j = 1; j<=num;j++){
           for(int i = 1; i<=j;i++){
                System.out.print("* ");
           }
            System.out.println();
        }
        
    }
}