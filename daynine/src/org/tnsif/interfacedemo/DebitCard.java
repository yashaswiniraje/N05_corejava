package org.tnsif.interfacedemo;

public interface DebitCard {
	/*by default all the variable inside interface are public static final 
	 * and if it if final we must have to initialize value to that variable*/
long cardno=123498762345L;
//we can't use concrete method inside an interface
//by default methods are abstracted
void displayCardDetails();
//default and static method are new features of java 8 inside interface 
default void display() {
	System.out.println("default method");
}
//static method
static void print(){
	System.out.println("static method");
}
}
