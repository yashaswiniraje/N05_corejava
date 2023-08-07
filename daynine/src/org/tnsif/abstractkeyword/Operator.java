package org.tnsif.abstractkeyword;

public abstract class Operator {
//abstract method
//if abstract class contain more than 21 method then provide implementation to all abstract method inside child class
	abstract void operation();
	abstract void multiplication();
	//non-abstract method
	 void print(int a,int b) {
		System.out.println(a+b);
	}

}
