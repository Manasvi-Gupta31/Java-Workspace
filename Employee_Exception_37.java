// Write a Java program using exception handling to create a class with attributes name, age, and salary.
// Validate age > 5 and salary > 70000 using try, catch, finally, throw and throws.

import java.util.Scanner;

public class Employee_Exception_37 {

    String name;
    int age;
    float salary;

    // method using throws
    void setData(String name, int age, float salary) throws Exception {

        String errorMessage = "";

        // validate age
        if (age <= 5) {
            errorMessage += "Age must be greater than 5\n";
        }

        // validate salary
        if (salary <= 70000) {
            errorMessage += "Salary must be greater than 70000\n";
        }

        // throw exception if any validation fails
        if (!errorMessage.isEmpty()) {
            throw new Exception(errorMessage);
        }

        // assign values if valid
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee_Exception_37 emp = new Employee_Exception_37();

        try {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Salary: ");
            float salary = sc.nextFloat();

            emp.setData(name, age, salary);

            // success message only when data is valid
            System.out.println("Data inserted successfully");

        } catch (Exception e) {
            System.out.println("Exception:\n" + e.getMessage());
        } finally {
            System.out.println("Program finished");
        }

        sc.close();
    }
}