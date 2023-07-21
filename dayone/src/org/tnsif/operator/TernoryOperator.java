package org.tnsif.operator;
import java.util.*;

public class TernoryOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		String res=(a%2==0)?"Even":"Odd";
		System.out.println("number is "+ res);
		

	}

}
