/*program to demonstrate class and object*/
package org.tnsif.classandobject;
//class declaration
class Data{
	String breadtype;
	int price;
	void display() {
		System.out.println("breadtype :"+ breadtype);
		System.out.println("price :"+ price);
	}
	
}
public class Sandwich {
	public static void main(String[] args) {
		Data s=new Data();
	    s.breadtype="white";
	    s.price=240;
		s.display();
	}

}