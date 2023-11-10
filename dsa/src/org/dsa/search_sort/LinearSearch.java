package org.dsa.search_sort;
import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Enter number to be searched");
        int num = sc.nextInt();
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
            	
                counter = counter + 1;
                break;
            }
        }
        if (counter > 0) {
            System.out.println("Number found:" + num);
        } else {
            System.out.println("Item not found");
        }
    }
}
