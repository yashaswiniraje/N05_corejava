package org.tnsif.singledimentionalarray;
import java.util.Scanner;
public class JaggedArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//in jagged array outside array size is fixed ,but inside array is different as different index
		//jagged array declaration 
		int arr[][]=new int[2][];
		//for outside array index 0 storing 3 elements
		arr[0]=new int[3];
		//for outside array index 1 storing 2 elements
		arr[1]=new int[2];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
			System.out.println(arr[i][j]);
			}
		}

	}

}
