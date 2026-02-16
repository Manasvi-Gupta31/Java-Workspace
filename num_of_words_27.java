//   Write a Java program to determine the number of words present in a string entered by the user.

import java.util.Scanner;

class num_of_words_27{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        //taking all the words in an array
        String arr[] = new String[str.length()];
        String regex = "[^a-zA-Z0-9]+";
        arr = str.split(regex);

	for(String s : arr){
		System.out.println(s);
	}

	System.out.println("Number of words in the string is "+arr.length+".");


    }
    
}