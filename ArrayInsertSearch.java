package HW_Day6;
import java.util.*;

public class ArrayInsertSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int searchElement = sc.nextInt();

        boolean found = false;
        int position = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == searchElement) {
                found = true;
                position = i;
                break;
            }
        }

        if (found) {
            System.out.println("Element found at position: " + position);
        } else {
            System.out.println("Element not found in the array.");
        }

       
    }
}