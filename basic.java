import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, sum, diff, mul, div, rem;
        System.out.println("Enter the first value of n");
        n1 = sc.nextInt();
        System.out.println("Enter the second value of n");
        n2 = sc.nextInt();
        sum = n1 + n2;
        if (n1 < n2)
            diff = n1 - n2;
        else
            diff = n2 - n1;
        mul = n1 * n2;
        
         if (n1 < n2) {
            div = n1 / n2;
            rem = n1 % n2;
        } 
        else {
            div = n2 / n1;
            rem = n2 % n1;
        }

        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + diff);
        System.out.println("The multiplication is: " + mul);
        System.out.println("The division is: " + div);
        System.out.println("The remainder is: " + rem);
        sc.close();
    }
}