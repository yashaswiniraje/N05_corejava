package org.tnsif.superkeyword;

public class StaticBlockExecutot {
	static float salary;
	static String complanyname;
	/*static block is used to initialize static variable we cant assign a value for any non static 
	 * variable inside static block */
	static {
		complanyname="Accenture";
		salary=3455.65f;
	}
	//static method
	static void print()
	{
		System.out.println(salary +" "+complanyname);
	}

	public static void main(String[] args) {
		print();
	

	}

}
