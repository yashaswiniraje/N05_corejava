package org.tnsif.singledimentionalarray;

import java.util.Scanner;
public class ArrayMinMaxElement {

	public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter lenght of array");
int n=sc.nextInt();
int arr[]=new int [n];
System.out.println("enter elements in array");
for(int i=0;i<n;i++) {
	
	arr[i]=sc.nextInt();
}
System.out.println("Array: ");
for(int i=0;i<n;i++) {
	System.out.print(arr[i]+" ");
	
}
int max=arr[0];
for(int i=0;i<arr.length;i++) {
	if (max<arr[i]) {
		max=arr[i];
		
	}
}
int min=arr[0];
for(int i=0;i<arr.length;i++) {
	if (min>arr[i]) {
		min=arr[i];
	}
}
System.out.println();
System.out.println("maximum element is :"+max);
System.out.println("minimum element is :"+min);


	}

}
