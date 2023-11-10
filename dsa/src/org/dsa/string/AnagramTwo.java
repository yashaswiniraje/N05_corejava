package org.dsa.string;

import java.util.Arrays;

public class AnagramTwo {
static boolean isanagram(String str1,String str2) {
	char[]array1=str1.toCharArray();
	char[]array2=str2.toCharArray();
	Arrays.sort(array1);
	Arrays.sort(array2);
	return Arrays.equals(array1, array2);
}
	public static void main(String[] args) {
		String input1="abc";
		String input2="bda";
		if(isanagram(input1,input2)) {
			System.out.println("anagram");
		}
		else{
			System.out.println("not");
		}
		

	}

}
