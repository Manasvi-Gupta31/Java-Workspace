// Write a program to Check whether a number is a Armstrong Number or not.

public class Armstrong_127 {
    public static void main(String[] args) {
        int num = 153;
        int temp = num, sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }

        if (sum == num)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}
