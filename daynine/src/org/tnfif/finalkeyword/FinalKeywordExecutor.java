package org.tnfif.finalkeyword;

public class FinalKeywordExecutor {

	public static void main(String[] args) {
	FinalVariable f=new FinalVariable();
	//not possible to change value of final variable
	//f.SALARY=45677.90f;
	f.print();
	Circle c=new Circle();
	
	c.printShapeType(c.area);

	}

}
