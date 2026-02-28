// Program to create Deadlock in Java using user input

import java.util.Scanner;

public class Deadlock_40 {

    // shared resources
    static Object lock1 = new Object();
    static Object lock2 = new Object();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter name of Thread 1: ");
        String t1Name = sc.nextLine();

        System.out.print("Enter name of Thread 2: ");
        String t2Name = sc.nextLine();

        // Thread 1
        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println(t1Name + " locked Resource 1");

                try { Thread.sleep(100); }
                catch (Exception e) {}

                System.out.println(t1Name + " waiting for Resource 2");

                synchronized (lock2) {
                    System.out.println(t1Name + " locked Resource 2");
                }
            }
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println(t2Name + " locked Resource 2");

                try { Thread.sleep(100); }
                catch (Exception e) {}

                System.out.println(t2Name + " waiting for Resource 1");

                synchronized (lock1) {
                    System.out.println(t2Name + " locked Resource 1");
                }
            }
        });

        t1.start();
        t2.start();

        sc.close();
    }
}