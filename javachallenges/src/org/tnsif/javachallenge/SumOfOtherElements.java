package org.tnsif.javachallenge;

import java.util.Scanner;

public class SumOfOtherElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Length of the array
            int[] arr = new int[n]; // Array to store the input elements
            int[] result = new int[n]; // Array to store the output elements

            // Input the array elements
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            // Calculate the sum of all elements in the array
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }

            // Calculate the result array
            for (int i = 0; i < n; i++) {
                result[i] = sum - arr[i];
            }

            // Output the result array
            for (int i = 0; i < n; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
