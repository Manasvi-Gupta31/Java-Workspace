// Write a Java program that allows a user to enter details of multiple students such as name, SAP ID, specialization, and batch. 
// The program should first ask how many students’ details need to be entered, 
// then take the information for each student, store it using objects, and finally display all the entered student details.

import java.util.Scanner;

class student{
    String name;
    int sap_id;
    String spec;
    int batch;

    student(String name , String spec , int sap_id , int batch){
        this.name = name;
        this.sap_id = sap_id;
        this.spec = spec;
        this.batch = batch;
    }

    void display(){
        System.out.println("Name : "+name);
        System.out.println("Sap id : "+sap_id);
        System.out.println("Specialization : "+spec);
        System.out.println("Batch : "+batch);
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //  Ask user number of students
        System.out.print("How many student details you want to enter? : ");
        int n = sc.nextInt();

        student[] arr = new student[n];

        for(int i = 0; i < arr.length; i++){
            System.out.println("\nEnter details for Student " + (i+1));

            System.out.print("Enter your name : ");
            String name = sc.next();

            System.out.print("Enter your sap id : ");
            int sap = sc.nextInt();

            System.out.print("Enter your specialization : ");
            String spec = sc.next();

            System.out.print("Enter your batch : ");
            int batch = sc.nextInt();

            arr[i] = new student(name, spec, sap, batch);
        }

        System.out.println("\nStudent Information\n");

        for(int i = 0; i < arr.length; i++){
            System.out.println("\nStudent " + (i+1));
            arr[i].display();
        }

        sc.close();
    }
}