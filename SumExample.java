import java.util.Scanner;

class SumExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        int sum = a + 5;
        System.out.println("sum = " + sum);

        sc.close();
    }
}