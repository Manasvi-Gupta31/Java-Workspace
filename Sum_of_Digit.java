//Programm to find the sum of a digit 
//ex : 56-> 5+6 = 11

import java.util.Scanner;

class sum{
    
    int sum_digit(int num){
        int sum_num = 0;
        while(num != 0){
            sum_num += num%10;
            num /= 10;
        }
        return sum_num;
    }
    
}

public class Sum_of_Digit{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        
        int num = sc.nextInt();
        
        sum s1 = new sum();
        int sum_of_num = s1.sum_digit(num);
        
        System.out.println("Sum of "+num+" is "+sum_of_num+".");
        
        sc.close();
    }
    
}