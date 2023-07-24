package org.tnsif.decisionmaking;
import java.util.*;
public class NestedIfExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		int weight=sc.nextInt();
		if(age>=12) {
			if(weight>40 && weight<110) {
				System.out.println("eligibale for bunjee jumping");
				
			}
			else if(weight>110) {
				System.out.println("etra ropes added");
			}
		}
		else {
			System.out.println("not eligibe");
		}
		

	}

}
