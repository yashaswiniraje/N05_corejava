package org.dsa.array;

import java.util.Scanner;

public class DeleteFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array1:");
        int len = sc.nextInt();
        System.out.println("Enter elements in array1:");
        int arr1[] = new int[len];
        for (int i = 0; i < len; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < len; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\nEnter index to delete:");
        int index = sc.nextInt();

        if (index < 0 || index >= len) {
            System.out.println("Invalid index. Index should be between 0 and " + (len - 1));
            return;
        }

        int arr2[] = new int[len - 1];
        for (int i = 0; i < len - 1; i++) {
            if (i < index) {
                arr2[i] = arr1[i];
            } else if (i==index) {
            	continue;
              
            }
            else {
            	arr2[i-1]=arr1[i];
            }
        }

        System.out.println("Your NEW array:");
        for (int i = 0; i < len - 1; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
