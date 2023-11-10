package org.dsa.search_sort;
import java.util.*;

public class BinarySearch {

    public static void main(String[] args) {
       int [] arr= {3,4,5,6,79,9};
       Scanner sc=new Scanner(System.in);
       System.out.println("enter number to search");
       int n=sc.nextInt();
       int beg=0;
       int end=arr.length-1;
       while(beg<=end) {
    	   int mid=(beg+end)/2;
    	   if(n==arr[mid]) {
    		   System.out.println("item found at index:  "+mid);
    		   break;
    	   }
    	   else if(n>arr[mid]) {
    		  beg=mid+1; 
    	   }
    	   else if(n<arr[mid]) {
    		   end=mid-1;
    	   }
    	   
       }
       if(beg>end){
		   System.out.println("item not found");
	   }
    }
}
