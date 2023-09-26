package org.tnsif.instanceofdemo;
//program to demonstrate on instance of operator
class Flower{
	String name="rose";
}
class Rose extends Flower{
	String color="Red";
}

public class InstanceOfExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rose r=new Rose();
Boolean res=(r instanceof Flower);
System.out.println(r instanceof Flower);
	}

}
