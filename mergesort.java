import java.util.Scanner;

class mergesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int t = 1; t < n; t = t * 2) {
            for (int l = 0; l < n - 1; l += 2 * t) {
                int mid = Math.min(l + t - 1, n - 1);
                int right = Math.min(l + 2 * t - 1, n - 1);
                int n1 = mid - l + 1;
                int n2 = right - mid;
                int a1[] = new int[n1];
                int a2[] = new int[n2];
                for (int i = 0; i < n1; i++)
                    a1[i] = arr[l + i];
                for (int j = 0; j < n2; j++)
                    a2[j] = arr[mid + 1 + j];
                int i = 0, j = 0, k = l;
                while (i < n1 && j < n2) {
                    if (a1[i] <= a2[j]) {
                        arr[k] = a1[i];
                        i++;
                    } else {
                        arr[k] = a2[j];
                        j++;
                    }
                    k++;
                }
                while (i < n1) {
                   arr[k] = a1[i];
                    i++;
                    k++;
                }
                while (j < n2) {
                    arr[k] = a2[j];
                    j++;
                    k++;
                }
            }
        }
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

