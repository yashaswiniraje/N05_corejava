package org.dsa.string;
import java.util.Scanner;

public class MaxChar {
    String MaxOccurChar(String[] str) {
        String c = null;
        int maxCount = 0;

        for (int i = 0; i < str.length; i++) {
            int count = 0;
            for (int j = 0; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                c = str[i];
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a list of strings separated by spaces:");
        String input = sc.nextLine();
        String[] str = input.split(""); // Split the input into an array of strings

        MaxChar m = new MaxChar();
        String result = m.MaxOccurChar(str);

        if (result != null) {
            System.out.println("The character that occurs most frequently is: " + result);
        } else {
            System.out.println("No character found.");
        }
    }
}
