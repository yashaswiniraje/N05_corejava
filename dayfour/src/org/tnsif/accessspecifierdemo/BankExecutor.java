package org.tnsif.accessspecifierdemo;
import org.tnsif.accessspecifier.*;
public class BankExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank();
		b.bankname="SBI";
		b.displayPublic();
		//b.pinNo;
		//b.displayPrivate();
		/*pinno and display private()method are private can't access into another class and another package
		 */
		
		/*acc no and display default method are default so can't access into another package only inside same package*/
		//b.accNo
		//b.displaydefault();

	}

}
