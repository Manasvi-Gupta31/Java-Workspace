//   WAP to tell frequency of a particular element in an array .


import java.util.Scanner;

public class frequency {

    int freq(int[] arr, int key) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Taking input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to find its frequency: ");
        int key = sc.nextInt();

        frequency f1 = new frequency();
        int result = f1.freq(arr, key);

        System.out.println("Frequency of " + key + " is " + result + ".");

        sc.close();
    }
}
