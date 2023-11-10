package org.dsa.recursion;

public class BasicRecursion {
//Use of Recursion Treees and Graph 
/* function that calls itself creates recursion outer function do some work 
 * and assume that reamining work will be careed out by inner function*/
//in recursion for each call new n are created that occupie much more memory can cause stack overflow to avoid define a base case 
	public static void printnum(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		printnum(n-1);
	}
	public static void main(String[] args)
	//print number from 5 to 1
	{
		printnum(5);
}
	}
