package org.dsa.string;

import java.util.ArrayList;
import java.util.Arrays;

public class StringDemoOne {

	public static void main(String[] args) {
		
		//formatting strings
		float fl=123.7978f;
		System.out.printf("formatted number is %.2f",fl); 
		System.out.println();
		System.out.printf("%.2f",Math.PI);
		System.out.println();
		System.out.printf("my name is %s and i am %s","yashu","student");
		System.out.println();
		//comparing strings
		String a="yashu";
		String b="yashu";
		String c=new String("yash");
		String d=new String("yash");
		System.out.println(a==b);
		System.out.println(c==d);
		//comparing string values
		System.out.println(a.equals(b));
		//char at
		System.out.println(a.charAt(0));
		//operators
		
		//Concatenating
		System.out.println((char)('a'+3));
		System.out.println("a"+2);
		System.out.println("hello"+"yashu");
		System.out.println("yash"+ new ArrayList<>());
//a to z printing		
for(int i=0;i<26;i++) {
	char ch=(char)('a'+i);
	System.out.println(ch);
	
	
}
//characters to array
	String name="yashu raje bhosale";
	System.out.println(Arrays.toString(name.toCharArray()));
	System.out.println(name.indexOf('s'));
	System.out.println(name.replace('a', 'k'));
	System.out.println(name.trim());
	System.out.println(Arrays.toString(name.split(" ")));
	}

}
