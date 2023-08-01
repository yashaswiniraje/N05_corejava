package org.tnsif.superkeyword;
class Sports{
	String sportsname="tennnis";
	void  display() {
		
		System.out.println("Sports name is: "+sportsname);
	}
	}
class Cricket extends Sports{
	int players=11;
	void display() {
		super.display();
		System.out.println("number of players :"+players);
	}
	
}
public class SuperKeywordMethod {

	public static void main(String[] args) {
	Cricket ck =new Cricket();
	
	ck.display();

	}

}
