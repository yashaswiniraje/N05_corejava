package org.tnsif.singledimentionalarray;
//program to demonstrate on array using compile time input value
public class ArrayExample {

	public static void main(String[] args) {
	int arr[]= {23,4,1,26,56};
	int arr1[]=new int[] {34,4,5,6,7,8};
	System.out.println(arr[2]);
	System.out.println(arr1[3]);
	//to print all value of array
	for(int i:arr) {
		System.out.print(i+" ");
		
	}
	
}
}