package org.dsa.string;

import java.util.Arrays;

public class StringToArray {
	
	public void name(String one,String two)
	{
	char[]ch=new char[one.length()];
	char[]ch2=new char[two.length()];
	for(int i=0;i<one.length();i++) {
		ch[i]=one.charAt(i);
	}
	for(int j=0;j<two.length();j++) {
		ch2[j]=two.charAt(j);
	}
	for(char c:ch) {
		System.out.println(c);
		
	}
	System.out.println();
	for(char c2:ch2) {
		System.out.println(c2);
	}
	
	
	}
	
	

	public static void main(String[] args) {
		
		StringToArray s= new StringToArray();
		s.name("yashaswini", "sanskruti");
		

	}

}
