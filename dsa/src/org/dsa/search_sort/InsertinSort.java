package org.dsa.search_sort;

public class InsertinSort {
	public static void main(String[]args) {
		int arr[]= {1,89,4,5,61};
		for (int i=0;i<arr.length;i++) {
			int current=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>current) {
				//keep swapping
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;
			}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		}
	}


