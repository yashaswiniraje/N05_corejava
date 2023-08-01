package org.tnsif.superkeyword;
//parent class
class State{
	String statename="Punjab";
	
}
//child class
class Capital extends State{
	String statename="Hariyana";
	String captital="chandigarh";
	public void display() {
//super keyword with variable is used to call parent class variable if and only if parent and child class variable name are same
		System.out.println(super.statename);
		System.out.println(statename);
		
		
	}
}
public class SuperKeywordVariable {

	public static void main(String[] args) {
		Capital c =new Capital();
		c.display();
		
		//System.out.println(c.statename);
		
		

	}

}
