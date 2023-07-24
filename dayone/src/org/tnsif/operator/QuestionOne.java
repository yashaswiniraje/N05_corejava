package org.tnsif.operator;
import java.util.*;

public class QuestionOne {
	public static void  Donation(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		System.out.println("enter weight");
		int weight=sc.nextInt();
		
		if((age>=18)&&(weight>=50)) {
			System.out.println("You can donate blood");
			
		}
		else {
			System.out.println("you are not eligible for donation");
		}
		
	}
public static void main(String[]args) {
	

	Donation();
	
}
}
