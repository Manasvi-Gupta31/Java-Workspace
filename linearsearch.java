import java.util.Scanner;
public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        int found = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == key) {
                found = i;
                break;
            }
        }
        if(found != 0) {
            System.out.println("Element found at position: " + (found + 1));
        } else {
            System.out.println("Element not found.");
        }
        sc.close();
    }
}


