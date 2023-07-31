package org.tnsif.thiskeyword;

public class ThisKeywordDemoFour {
	int x;
	//default constructor
	ThisKeywordDemoFour()
	{   this(23);
		System.out.println("default constructor");
	}
	//parameterized constructor
	ThisKeywordDemoFour(int x){
		this.x=x;
		System.out.println("parameterized constructor "+x);
	}

	public static void main(String[] args) {
		
		ThisKeywordDemoFour t4=new 	ThisKeywordDemoFour();

	}

}
