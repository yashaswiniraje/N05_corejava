//program to demonstrate access specifier
package org.tnsif.accessspecifier;
public class Bank {
	//different access specifier
	public String bankname="SBI";
	private int pinNo;
	long accNo=1234567894L;
	//public method
	public void displayPublic() {
		System.out.println("bank name is : "+bankname);
	}
	//private method
	private void displayPrivate()
	{
		System.out.println("pin no is"+pinNo);
	}
	//default method
	void dispaydefault() {
		System.out.println("acc no is"+accNo);
		
	}
	

}
