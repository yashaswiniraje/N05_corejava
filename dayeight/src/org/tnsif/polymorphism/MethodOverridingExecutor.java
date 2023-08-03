package org.tnsif.polymorphism;
import java.util.*;
class Laptop{
	
	int RAM;
	String generation1;
	void specification(String generation1,String generation2) {
		System.out.println("laptop"+generation1);
	}
	
}
class Asus extends Laptop{
	String generation2;
	void specification(String generation1,String generation2) {
		super.specification(generation1, generation2);
		System.out.println("Asus"+" "+generation2);
	}
	
}
public class MethodOverridingExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Asus a=new Asus();
		String generation1 = sc.nextLine();
		String generation2 = sc.nextLine();
		a.specification(generation1,generation2);

	}

}
