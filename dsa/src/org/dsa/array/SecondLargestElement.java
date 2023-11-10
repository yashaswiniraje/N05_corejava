package org.dsa.array;

public class SecondLargestElement {
static void second_last(int[]arr) {
	int n=arr.length;
	
	int max=0;
	for(int i=0;i<n;i++) {
		for(int j=i+1;j<n;j++) {
			if(arr[i]<arr[j]) {
				max=arr[i];
			}
			
		}
	}
	System.out.println(max +" :second maximum number");
	
}
	public static void main(String[] args) {
		
int arr[]= {1,5,7,8,2};
second_last(arr);
	}

}
