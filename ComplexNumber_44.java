// Write a java program to add two complex numbers.

import java.util.Scanner;

class ComplexNumber_44 {
    int real, imaginary;

    // Constructor
    public ComplexNumber_44(int r, int i) {
        this.real = r;
        this.imaginary = i;
    }

    // Method to display complex number properly
    public void showC() {
        if (imaginary >= 0)
            System.out.print(real + " + " + imaginary + "i");
        else
            System.out.print(real + imaginary + "i");
    }

    // Method to add two complex numbers
    public static ComplexNumber_44 add(ComplexNumber_44 n1, ComplexNumber_44 n2) {
        int realPart = n1.real + n2.real;
        int imaginaryPart = n1.imaginary + n2.imaginary;
        return new ComplexNumber_44(realPart, imaginaryPart);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("\nEnter First Complex Number:");
        System.out.print("Enter Real Part: ");
        int r1 = s.nextInt();
        System.out.print("Enter Imaginary Part: ");
        int i1 = s.nextInt();

        System.out.println("\nEnter Second Complex Number:");
        System.out.print("Enter Real Part: ");
        int r2 = s.nextInt();
        System.out.print("Enter Imaginary Part: ");
        int i2 = s.nextInt();

        // Creating objects
        ComplexNumber_44 c1 = new ComplexNumber_44(r1, i1);
        ComplexNumber_44 c2 = new ComplexNumber_44(r2, i2);

        // Displaying entered numbers
        System.out.print("\nFirst Complex Number: ");
        c1.showC();

        System.out.print("\nSecond Complex Number: ");
        c2.showC();

        // Adding numbers
        ComplexNumber_44 result = add(c1, c2);

        // Displaying result
        System.out.print("\n\nResult after Addition: ");
        result.showC();

        s.close();
    }
}