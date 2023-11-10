package org.dsa.string;

public class PalindromeTwo {
public static boolean ispalindrome(String str) {
	int left=0;
	int right=str.length()-1;
	while(left<right) {
		if(str.charAt(left)!=str.charAt(left)) {
			return false;
		}
		left++;
		right--;
	}
	return true;
	
}
	public static void main(String[] args) {
		String input="cra";
		if(ispalindrome(input)) {
			System.out.println("palindrome");
		}
		else{
			System.out.println("not");
		}
		
	}

}

