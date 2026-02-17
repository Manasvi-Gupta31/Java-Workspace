// Write a Java program using exception handling to create a class with attributes name, age, and salary. 
// Validate that age is greater than 5 and salary is greater than 70,000 using try, catch, finally, throw, and throws. 
// Print “Data inserted successfully” if the data is valid.

import java.util.Scanner;

public class Employee_Exception_29 {

    String name;
    int age;
    float salary;

    // method using throws
    void setData(String name, int age, float salary) throws Exception {

        String errorMessage = "";

        // check age
        if (age <= 5) {
            errorMessage += "Age must be greater than 5\n";
        }

        // check salary
        if (salary <= 70000) {
            errorMessage += "Salary must be greater than 70000\n";
        }

        // if any error exists → throw exception
        if (!errorMessage.isEmpty()) {
            throw new Exception(errorMessage);
        }

        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        try {
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Salary: ");
            float salary = sc.nextFloat();

            emp.setData(name, age, salary);

            System.out.println("Data inserted successfully.");

        } 
        catch (Exception e) {
            System.out.println("Exception:\n" + e.getMessage());
        } 
        finally {
            System.out.println("Data inserted successfully");
        }

        sc.close();
    }
}