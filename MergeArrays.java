package HW_Day6;
import java.util.*;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int n1 = sc.nextInt();

        System.out.print("Enter the size of the second array: ");
        int n2 = sc.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        int[] mergedArr = new int[n1 + n2];

        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int j = 0;
        for (int i = 0; i < n1; i++) {
            mergedArr[j++] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            mergedArr[j++] = arr2[i];
        }

        System.out.println("Merged array:");
        for (int i = 0; i < n1 + n2; i++) {
            System.out.print(mergedArr[i] + " ");
        }
    }
}