package org.tnsif.singledimentionalarray;
import java.util.Scanner;
public class TwoDimentionalArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n,m;
		System.out.println("enter value for row");
		n=sc.nextInt();
		System.out.println("enter value for col");
		m=sc.nextInt();
		int [][] arr=new int [n][m];
		System.out.println("enter value of array");
		for (int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("your array: ");
		for (int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
			System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
