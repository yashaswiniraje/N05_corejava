package org.tnsif.decisionmaking;
import java.util.*;
public class ForLoopExecutor {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int row=sc.nextInt();
	int col=sc.nextInt();
	
	
int[][] arr=new int[row][col];
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr.length;j++) {
		arr[i][j]=sc.nextInt();
	}
	
}
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr.length;j++) {
		System.out.println(arr[i][j]);
	}
	
}
sc.close();
}
	
		}
