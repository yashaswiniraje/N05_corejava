package org.tnsif.interfacedemo;
//driver class
//program to demonstrate an interface
public class InterfaceExecutor {

	public static void main(String[] args) {
		//Cannot instantiate the interface 
		//DebitCard d=new DebitCard();
		
		SBIDebitCard s=new SBIDebitCard();
		CheesePopcorn c=new CheesePopcorn();
		Person p= new Person();
//print() is a  static method inside interface to call print method we have to use interfacename.methodname
		DebitCard.print();
		s.displayCardDetails();
//we can call default method of interface using object of implementable class
		s.display();
		c.displayReceipe();
		p.showdrink();
		
			
	}

}
