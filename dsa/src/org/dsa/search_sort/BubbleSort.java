package org.dsa.search_sort;
import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		int arr[]={1,5,7,4,2};
	    System.out.println("sorted array: ");
	   for(int i=0;i<arr.length;i++) {
		   for(int j=0;j<arr.length-i-1;j++) {
			   if(arr[j]>arr[j+1]) {
				   int temp=arr[j];
				   arr[j]=arr[j+1];
				   arr[j+1]=temp;
			   }
		   }
	   }
	    	for(int i=0;i<arr.length;i++) {
	    		System.out.println(arr[i]);
	    }
	}

}
