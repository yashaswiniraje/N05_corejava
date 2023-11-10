package org.dsa.array;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		 ArrayList<Integer> arr = new ArrayList<Integer>();
	        arr.add(7);
	        arr.add(9);
	        arr.add(3);
	        System.out.println(arr);
	        arr.add(0, 4);
	        System.out.println(arr);
	        arr.set(0, 9);
	        System.out.println(arr);
	        arr.remove(0);
	        System.out.println(arr);
	        int size=arr.size();
	        System.out.println("size is"+size);
	        for(int i=0;i<arr.size();i++) {
	    	  System.out.println(arr.get(i));
	      }
	      Collections.sort(arr);
	      System.out.println(arr);
	}

}
