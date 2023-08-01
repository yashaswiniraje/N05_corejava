package org.tnsif.superkeyword;

public class StaticVariableExecutor {
	/*if any variable is not static and outside main function and you want to access that variable inside 
	 * main function the we need to make that variable as static */
	// int num=6;
	static int num=6;

	public static void main(String[] args) {
		/*StaticVariableExecutor s =new StaticVariableExecutor();
		System.out.println(s.num);*/
		System.out.println(num);
		

	}

}
