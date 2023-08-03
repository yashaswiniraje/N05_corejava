package org.tnsif.polymorphism;
import java.util.*;
//compile time polymorphism
public class MethodOverloadingExecutor {
class Bollywood{
	String str1,str2,str3;
	//method overloading based on changing number of arguments
	static void display(String str1,String str2) {
		System.out.println(str1 +" loves "+str2);
	}
	
	static void display(String str1,String str2,String str3) {
		System.out.println(str1 +" loves "+str2 + " and "+ str3);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter three strings :");
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		String str3=sc.next();
		Bollywood.display(str1, str2);
		Bollywood.display(str1, str2, str3);
		
	}

}
