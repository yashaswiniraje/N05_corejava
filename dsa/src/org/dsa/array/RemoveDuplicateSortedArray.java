package org.dsa.array;

import java.util.Scanner;

public class RemoveDuplicateSortedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[8];
        System.out.println("Enter numbers in the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array (you can use Arrays.sort(arr) for simplicity)
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Unique array elements:");
        int unique = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[unique] = arr[i];
                unique++;
            }
        }

        for (int i = 0; i < unique; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
