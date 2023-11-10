package org.dsa.string;

public class SubStringExecutor {
	public static void substring(String str) {
		int n=str.length();
		for(int i=0;i<n;i++) {
			for (int j=i;j<n;j++) {
				for(int k=i;k<=j;k++) {
					System.out.println(str.charAt(k));
				}
				System.out.println();
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="yash";
substring(str);
	}

}
