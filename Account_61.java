// Constructor + Validation

import java.util.Scanner;

class Account_61 {

    String name;
    double balance;

    // Constructor with validation
    Account_61(String n, double b) {
        name = n;

        if (b < 0) {
            System.out.println("Negative balance not allowed. Setting to 0.");
            balance = 0;
        } else {
            balance = b;
        }
    }

    void display() {
        System.out.println("\nName: " + name);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter balance: ");
        double bal = sc.nextDouble();

        Account_61 a1 = new Account_61(name, bal);

        a1.display();
    }
}