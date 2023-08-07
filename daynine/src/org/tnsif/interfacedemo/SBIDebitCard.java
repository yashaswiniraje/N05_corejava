package org.tnsif.interfacedemo;
//we can't use extends we have to use implements we can use extends for interface to interface
public class SBIDebitCard implements DebitCard{

	@Override
	public void displayCardDetails() {
		System.out.println("card number is"+cardno);
		
	}

}
