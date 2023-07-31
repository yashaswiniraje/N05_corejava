package org.tnsif.decisionmaking;
import java.util.Scanner;
public class DigitCountExecutor {
		  public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    System.out.print("Enter a number: ");
		    int num = sc.nextInt();
		    int count = 0;
		    do {
		    	System.out.println("Number of digits: " + count);
		    	 num /= 10;
			     ++count;
		    }
		    while (num != 0); {
		     
		    }
		    
		  }
		}

	


