package org.tnsif.uncheckexception;

import java.io.IOException;

public class ThrowExecutor {
	//throws keyword is used to declare exception
	static void isEligible(int age,int weight)throws IOException
	{
		if(age>18 && weight>50) {
			System.out.println("eligible to donate the blood");
		}
		else
			//throw keyword used to throw exception explicitly
			throw new IOException("not eligible for blood donation");
	}
	public static void main(String[] args) throws IOException {
		isEligible(19,55);

	}

}
