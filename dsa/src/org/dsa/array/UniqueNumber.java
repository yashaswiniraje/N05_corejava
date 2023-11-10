package org.dsa.array;
import java.util.*;
public class UniqueNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=5;
		int arr[]=new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					arr[i]=-1;
					arr[j]=-1;
					
				}	
			}
			
		}
		
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			
		if(arr[i]>0) {
			ans=arr[i];
		
		
		}
	

	}
			System.out.println(ans);

}
	}
