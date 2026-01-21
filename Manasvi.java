import java.util.Scanner;
class Manasvi {
    public static void main(String [] args) {
        int sum, sum_array=0;
    Scanner sc=new Scanner (System.in);
         sum = sc.nextInt();
        int arr[] = new int [5];
        for (int i=0; i<5; i++) {
            arr[i] = sc.nextInt();
            sum_array += arr[i]; 
        }
    if (sum == sum_array) {
        System.out.println("Equal sum");
    }
    else {
        System.out.println("Done");
    }
}
}
