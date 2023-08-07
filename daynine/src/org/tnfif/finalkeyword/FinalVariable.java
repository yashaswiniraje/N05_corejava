package org.tnfif.finalkeyword;

public class FinalVariable {
	//The blank final field NUM may not have been initialized
	//final int NUM;
	final float SALARY=76000.67f;
	public void print()
	{
		//can't change value of final variable The final field FinalVariable.SALARY cannot be assigned
		//SALARY=89000.56f;
		System.out.println("salary id : "+ SALARY);
	}

}
