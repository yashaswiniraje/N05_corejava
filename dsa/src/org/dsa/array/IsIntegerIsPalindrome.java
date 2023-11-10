package org.dsa.array;

public class IsIntegerIsPalindrome {
	public boolean isPalindrome(int x) {
	    // Negative numbers are not palindromes
	    if (x < 0) {
	        return false;
	    }

	    String str = Integer.toString(x);
	    int start = 0;
	    int end = str.length() - 1;

	    while (start <= end) {
	        if (str.charAt(start) == str.charAt(end)) {
	            return true; // If characters don't match, it's not a palindrome
	        }
	        start++;
	        end--;
	    }

	    return false; // If the loop completes, it's a palindrome
	}

	
	public static void main(String[] args) {
		IsIntegerIsPalindrome ip=new IsIntegerIsPalindrome();
		System.out.println(ip.isPalindrome(-10));


	}

}
