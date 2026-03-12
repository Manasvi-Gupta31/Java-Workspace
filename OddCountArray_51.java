// Find the number occurring odd number of times in an array

import java.util.Scanner;

public class OddCountArray_51 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Numbers occurring odd number of times:");

        for(int i = 0; i < n; i++){

            int count = 0;

            // Count frequency
            for(int j = 0; j < n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            // Check if already printed
            boolean printed = false;
            for(int k = 0; k < i; k++){
                if(arr[i] == arr[k]){
                    printed = true;
                    break;
                }
            }

            if(count % 2 != 0 && !printed){
                System.out.println(arr[i]);
            }
        }
    }
}