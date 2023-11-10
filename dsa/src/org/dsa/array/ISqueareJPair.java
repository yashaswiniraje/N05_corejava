package org.dsa.array;

public class ISqueareJPair {
	 public static void main(String[] args) {
	    	int[] arr = {10,16,20,8,3,4,6, 2, 5, 2, 12};
	 
     boolean pairfound=false;
     for(int i=0;i<arr.length-1;i++) {
     	for(int j=i+1;j<arr.length-1;j++) {
     		if(arr[i]>2*arr[j]) {
     			System.out.println(arr[i]+","+arr[j]);
     			pairfound=true;
     		}
     		
     	}
     	
     }
     if(!pairfound) {
     	System.out.println("pair not found");
     }
	 }
   
    }

