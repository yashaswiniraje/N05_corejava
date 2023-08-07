package org.tnsif.interfacedemo;

public class Person implements Colddrink,Alcohol{

	@Override
	public void showdrink() {
		System.out.println(brand +" "+alcoholname+ " "+name);
		
	}

}
