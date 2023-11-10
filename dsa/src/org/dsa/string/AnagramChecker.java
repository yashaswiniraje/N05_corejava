package org.dsa.string;
import java.util.Arrays;

public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {
        if(str1.length()!=str2.length()) {
        	return false;
        }
        
        else {
        	char[]ch=str1.toCharArray();
        	char ch2[]=str2.toCharArray();
        	Arrays.sort(ch);
        	Arrays.sort(ch2);
        	return Arrays.equals(ch, ch2);
        }
    }

    public static void main(String[] args) {
        String input1 = "abd";
        String input2 = "bad";

        if (areAnagrams(input1, input2)) {
            System.out.println(input1 + " and " + input2 + " are anagrams.");
        } else {
            System.out.println(input1 + " and " + input2 + " are not anagrams.");
        }
    }
}


