package org.dsa.string;

public class PalindromeChecker {
   public  void anagramchecker(String str) {
	   int left=0;
	   int right=str.length()-1;
	   while(left<right) {
		   left++;
		   right--;
	   }
	   if(str.charAt(left)==str.charAt(right)) {
			System.out.println("palindrome"); 
	   }
	   else{
		  System.out.println("not palindrome");
	   }
	   
	   
   }
    public static void main(String[] args) {
    	PalindromeChecker p= new PalindromeChecker();
    	p.anagramchecker("abccba");
    }
    
}

