package org.dsa.array;
import java.util.*;
public class MinMaxArray {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<arr.length;i++)
		{
		 arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
		 System.out.println(arr[i]);
		}
		Arrays.sort(arr);
		int min=arr[0];
		int max=arr[n-1];
		System.out.println("min of array:" +min);
		
		System.out.println("max of array:" +max);
			

	}

}
