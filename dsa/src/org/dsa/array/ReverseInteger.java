package org.dsa.array;

public class ReverseInteger {

    public static void main(String[] args) {
        int x = -12340;
        String str = Integer.toString(x);
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // Find the index of the first non-zero character
        int first= 0;
        while (arr[first] == '0') {
            first++;
        }
        int ending= arr.length-1;
        while (arr[end] == '-') {
            ending--;
        }
        // Print the characters from the first non-zero character to the end
        for (int i = first; i < ending; i++) {
            System.out.print(arr[i]);
        }
    }
}
