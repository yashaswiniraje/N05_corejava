package org.dsa.array;

import java.util.Scanner;

public class InsertIntoArray {
    public static void main(String[] args) {
    	Scanner sc=new Scanner (System.in);
    	System.out.println("enetr lenght of array1");
        int len=sc.nextInt();
        System.out.println("enter elements in array1");
        int arr1[]=new int[len];
        for(int i=0;i<len;i++) {
        	arr1[i]=sc.nextInt();
        }
        for(int i=0;i<len;i++) {
        	System.out.println(arr1[i]);
        }
        System.out.println("enter new index" );
        int index=sc.nextInt();
        System.out.println("enetr new value at index "+index);
        int newvalue=sc.nextInt();
        int arr2[]=new int[len+1];
        for(int i=0;i<len+1;i++) {
        	if(i<index) {
        		System.out.println(arr2[i]=arr1[i]);
        		}
        	else if (i==index) {
        		arr2[i]=newvalue;
        	}
        	else
        	{
        		System.out.println(arr2[i]=arr1[i-1]);
        	}
        }
        	 System.out.println("Your NEW array:");
             for (int i= 0; i < len + 1; i++) {
             System.out.print(arr2[i] + " ");
              }
        	
        }
        
        
    }

