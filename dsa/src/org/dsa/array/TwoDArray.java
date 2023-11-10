package org.dsa.array;
import java.util.*;

public class TwoDArray {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int row,col;
	row=sc.nextInt();
	col=sc.nextInt();
	int num[][] =new int[row][col];
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++) {
			num[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++) {
		 System.out.println(num[i][j]);
		 
		 
		}
	}
	}
	

}