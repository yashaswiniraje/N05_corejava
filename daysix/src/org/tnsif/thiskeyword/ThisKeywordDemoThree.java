package org.tnsif.thiskeyword;

public class ThisKeywordDemoThree {
void print(ThisKeywordDemoThree t3) {
	System.out.println("hey there!!");
}
void display() {
	/*when you call parameterized method inside non parameterized we get error to
	 * overcome that we have to use this keyword as an argument in method call*/
	print(this);
}
	public static void main(String[] args) {
		ThisKeywordDemoThree t3= new ThisKeywordDemoThree();
		t3.display();

	}

}
