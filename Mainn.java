import java.util.Scanner;
class Mainn {
    int n;
    int sum = 0;
    public static void main(String[] args) {
        Mainn m = new Mainn();   // fixed here
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        m.n = s.nextInt();
        System.out.println("You entered: " + m.n);
    }
}
