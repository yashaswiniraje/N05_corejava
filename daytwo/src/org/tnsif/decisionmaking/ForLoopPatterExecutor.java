package org.tnsif.decisionmaking;
import java.util.*;
public class ForLoopPatterExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int j=0;j<=num;j++) {
			System.out.println("*");
		}
			System.out.println();
		}
		sc.close();
	}
	
}
