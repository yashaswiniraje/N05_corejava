package org.tncif.introduction;
import java.util.*;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("enter b");
		int b=sc.nextInt();
		System.out.println("enter a");
		System.out.println("a+b is" +" "+ a+b);
		System.out.println("enter a float value : ");
		float c=sc.nextFloat();
		System.out.println(c);
		System.out.println("enter a character");
		char ch=sc.next().charAt(0);
		System.out.println(ch);
		System.out.println("enter a string ");
		String str=sc.nextLine();
		System.out.println(str);
		

	}

}
