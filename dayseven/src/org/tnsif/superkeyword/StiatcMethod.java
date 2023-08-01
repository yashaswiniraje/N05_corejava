package org.tnsif.superkeyword;

public class StiatcMethod {
	//int age=20;
	//String name="yashaswini";
	/*if any method outside main function and we want to access that method inside main function 
	* we have to make that method as  a static */
	static int age=20;
	static String name="yashaswini";
	public static void display() {
		//we cannot use any non static variable inside static method
		System.out.println(name+" "+age);
	}

	public static void main(String[] args) {
		display();

	}

}
