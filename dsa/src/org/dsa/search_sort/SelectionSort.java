package org.dsa.search_sort;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {1,6,3,8,2,5};
		for(int i=0;i<arr.length;i++) {
			int loc=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[loc]>arr[j]) {
					loc=j;
				}
				
			}
			int temp=arr[i];
			arr[i]=arr[loc];
			arr[loc]=temp;
		
		}
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);

	}

}
}
