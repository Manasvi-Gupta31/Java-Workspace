//Programm to to know whether a number is odd or even

import java.util.Scanner;

class know_number{
	
	void o_e(double number){

		if(number%1 != 0){
			System.out.println(number + " is a decimal number (neither odd nor even).");
		}
		else{

			//TypeCasting
			int num = (int)number;

			if(num%2 == 0){
				System.out.println(num + " is an even number.");
			}
			else{
				System.out.println(num + " is a odd number.");
			}

		}
		
	}

}

public class Odd_Even{
	
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);

	System.out.println("-------Enter a number to know whether it's odd or even-------");

	double number = sc.nextDouble();

	know_number n1 = new know_number();

	n1.o_e(number);

	sc.close();

	}

}