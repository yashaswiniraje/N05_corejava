package org.dsa.array;
import java.util.*;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number length of the array:");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter numbers in the array:");
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Your array:");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }

        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.println("\nReversed array:");
        for (int k = 0; k < length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
