package org.tnsif.uncheckexception;
import java.util.Scanner;
//program to demonstrate on arithmetic exception
public class ArithmeticExceptionExecutor {
//try block contain exception code catch block is used to handle exception
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("print a");
		int a=sc.nextInt();
		System.out.println("print b");
		int b=sc.nextInt();
		try {
			System.out.println("a/b :"+a/b);
		}
		catch(Exception e){
			System.out.println("Exception handle: " +e);
		}
				

	}

}
