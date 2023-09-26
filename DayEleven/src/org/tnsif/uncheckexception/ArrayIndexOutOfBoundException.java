package org.tnsif.uncheckexception;

public class ArrayIndexOutOfBoundException {
static void print(int arr[]) {
	System.out.println(arr[2]);
	try {
		
		System.out.println(arr[4]);
	}
	catch(Exception e) {
		System.out.println("Exception handle: "+e);
	}
	finally {
		System.out.println("finally block always executed");
	}
	System.out.println("any statement outside block is always executed");
}
	public static void main(String[] args) {
		
	int arr[]= {3,4,5};
	print(arr);
	}
}
