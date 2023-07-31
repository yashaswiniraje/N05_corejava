package org.tnsif.thiskeyword;

public class ThisKeywordDemoOne {
	int x,y;
	 void setdata(int x,int y) {
		 //we can change parameter name also.
		this.x=x;
		this.y=y;
	}
	
     void display() {
		
		System.out.println(x+" "+y);
	}

	public static void main(String[] args) {
		ThisKeywordDemoOne t=new ThisKeywordDemoOne();
		t.setdata(2, 3);
		t.display();
		

	}

}
