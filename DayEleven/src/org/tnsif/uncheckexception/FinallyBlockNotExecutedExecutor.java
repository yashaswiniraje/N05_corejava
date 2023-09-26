package org.tnsif.uncheckexception;

import java.util.Scanner;

public class FinallyBlockNotExecutedExecutor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("print a");
		int a=sc.nextInt();
		System.out.println("print b");
		int b=sc.nextInt();
		try {
			System.out.println("a/b :"+a/b);
		//when we use system.exit(0) then finally block dies not executed
			//System.exit(0);
		}
		catch(Exception e){
			System.out.println("Exception handle: " +e);
			//System.exit(0);
		}
		finally {
			//when finally block contains an exception then finally block does not get execute
		//	System.out.println(4/0);
			System.out.println("finally block always get execute");
		}
				


	}

}
