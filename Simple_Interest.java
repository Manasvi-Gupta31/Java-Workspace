//Programm to calculate Simple Interest

import java.util.Scanner;

class Simple_Interest{
    
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("--------Programm to calculate Simple Interest--------");

        System.out.print("Enter amount : ");
        double amount = s.nextDouble();

        System.out.print("Enter interest rate : ");
        double interest = s.nextDouble();

        System.out.print("Enter year : ");
        int year = s.nextInt();

        double simple_interest = (amount*interest*year)/100;

        System.out.println("Simple Interest for amount "+amount+" with interest rate "+interest+" for "+year+" year is "+simple_interest+".");

    }
}
