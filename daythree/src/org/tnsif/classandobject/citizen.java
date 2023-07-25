package org.tnsif.classandobject;
public class citizen{
	///data members
	String type;
	long aadharNo;
	String gender;
	String city;
	//parameterized constructor
	public citizen()
	{
		System.out.println("demonstrate");
	}
	
	public citizen(String type, long aadharNo, String gender, String city) {
		
		this.type = type;
		this.aadharNo = aadharNo;
		this.gender = gender;
		this.city = city;
	}

	@Override
	public String toString() {
		return "citizen [type=" + type + ", aadharNo=" + aadharNo + ", gender=" + gender + ", city=" + city + "]";
	}
	


		
	}


