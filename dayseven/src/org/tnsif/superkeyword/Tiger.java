package org.tnsif.superkeyword;

public class Tiger extends Animal {
	void eat()
	{
		System.out.println("eating:child");
	}
 static void run()
 {   //cannot use super in context we cannot override
	 //super.run();
	 System.out.println("running:child");
 }
}
