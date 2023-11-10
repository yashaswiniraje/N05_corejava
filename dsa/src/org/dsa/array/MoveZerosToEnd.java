package org.dsa.array;

public class MoveZerosToEnd {
	public void movezero(int nums[]) {
		int n=nums.length;
		int counter=0;
	for(int i=0;i<n;i++) {
		if(nums[i]!=0) {
			nums[counter]=nums[i];
			counter++;
		}
		
	}
	while(counter<n) {
		nums[counter]=0;
		counter++;
	}
	for(int i=0;i<n;i++) {
		System.out.println(nums[i]);
	}
	}
	public static void main(String[]args) {
		int num[]= {0,2,0,3,4};
		MoveZerosToEnd mz=new MoveZerosToEnd();
		mz.movezero(num);
	}

}
