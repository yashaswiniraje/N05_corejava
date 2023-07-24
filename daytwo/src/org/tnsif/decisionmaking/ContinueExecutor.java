package org.tnsif.decisionmaking;

import java.util.Scanner;

public class ContinueExecutor {

		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<10;i++) {
			if(i==5)
				continue;
			else
				System.out.println(i);
		}
	}

}
