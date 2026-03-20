import java.util.Scanner;

class Employee_59 {

    int id;
    String name;
    double salary;

    // Constructor to initialize values
    Employee_59(int i, String n, double s) {
        id = i;
        name = n;
        salary = s;
    }

    // Method to display employee details
    void display() {
        System.out.println("\n Employee Details ");
        System.out.println("ID     : " + id);
        System.out.println("Name   : " + name);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking number of employees
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        // Creating array of objects
        Employee_59 emp[] = new Employee_59[n];

        // Taking input for each employee
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details for Employee " + (i + 1) + ":");

            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            // Initialize object using constructor
            emp[i] = new Employee_59(id, name, salary);
        }

        // Display all employees
        System.out.println("\n Employee List -> ");
        for (int i = 0; i < n; i++) {
            emp[i].display();
        }
    }
}