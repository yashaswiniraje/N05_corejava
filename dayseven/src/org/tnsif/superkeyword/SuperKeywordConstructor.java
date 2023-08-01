package org.tnsif.superkeyword;
class Nationality{
	String nationname;

	public Nationality(String nationname) {
		this.nationname = nationname;
		System.out.println(nationname);
	}
	
}
class person extends Nationality{
	String language;

	public person(String nationname, String language) {
		//use to call parent class constructor
		super(nationname);
		this.language = language;
		System.out.println(language);
	}
	
	
}
public class SuperKeywordConstructor {

	public static void main(String[] args) {
		person p=new person("Germany","German");
		

	}

}
