// print number of vowels in a string.

import java.util.Scanner;

class num_of_vowel{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        String s_str = str.toLowerCase();
        int count_vowel = 0;
        for(int i = 0;i<s_str.length();i++){
            char c = s_str.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count_vowel ++;
            }
        }

        System.out.println("Number of vowels in the string is "+count_vowel+".");
        
        sc.close();
        
    }
    
}