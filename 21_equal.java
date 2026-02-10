//  Check whether two strings are equal using equals().
import java.util.Scanner;

class equal{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str1 = sc.next();
        System.out.print("Enter a string : ");
        String str2 = sc.next();

        System.out.println("Str 1 equals to str2  : "+str1.equals(str2)+".");
    sc.close();
    }
}
