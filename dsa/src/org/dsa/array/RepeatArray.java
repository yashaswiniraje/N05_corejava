package org.dsa.array;
import java.util.*;
public class RepeatArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr number lengh of array");
	    int lenght=sc.nextInt();
	    int arr[]=new int[lenght];
	    System.out.println("enter numbers in array");
	    for (int i=0;i<lenght;i++) {
	    	arr[i]=sc.nextInt();
	    }
	    System.out.println("your array: ");
	    for (int i=0;i<lenght;i++) {
	    	System.out.println(arr[i]);
	    }
	    Arrays.sort(arr);
	    for (int i=0;i<lenght;i++) {
	    	for(int j=i+1;j<lenght;j++) {
	    		if( arr[i]==arr[j])	    {	
	    		System.out.println("repeat numbers : "+arr[i]+"on index "+i +" and "+ j);
	    }

	}

	}
	}
}
