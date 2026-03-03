import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class ReverseLinkedList_43 {

    public static void main(String[] args) {

        // Scanner object to take input from user
        Scanner s = new Scanner(System.in);

        // Creating an empty LinkedList
        LinkedList<Integer> numbers = new LinkedList<>();

        // Asking user how many elements they want to enter
        System.out.print("Enter the number of elements: ");
        int size = s.nextInt();
        
        System.out.println("Enter the numbers:");
        for (int i = 1; i <= size; i++) {
            System.out.print("Number " + i + ": ");
            numbers.add(s.nextInt());
        }

        // Printing original list
        System.out.println("\nOriginal Linked List: " + numbers);

        // Creating another LinkedList to store reversed elements
        LinkedList<Integer> reversedNumbers = new LinkedList<>();

        // iterator in reverse direction
        Iterator<Integer> reverseIterator = numbers.descendingIterator();

        // Traversing in reverse and adding into new list
        while (reverseIterator.hasNext()) {
            reversedNumbers.add(reverseIterator.next());
        }

        // Printing the reversed list
        System.out.println("Reversed Linked List: " + reversedNumbers);

        s.close();
    }
}