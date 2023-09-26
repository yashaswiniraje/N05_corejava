//encapsulation program
//achieve data hiding using access specifier
package org.tnif.encapsulation;
public class HDFC {
	private long accNO;
	private int cvvNo;
	private String accType;
	private int pinNo;
	
	//setter method used to set a method
	//getter method is used to get or return a value
	public long getAccNO() {
		return accNO;
	}
	public void setAccNO(long accNO) {
		this.accNO = accNO;
	}
	public int getCvvNo() {
		return cvvNo;
	}
	public void setCvvNo(int cvvNo) {
		this.cvvNo = cvvNo;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}
	@Override
	public String toString() {
		return "HDFC [accNO=" + accNO + ", cvvNo=" + cvvNo + ", accType=" + accType + ", pinNo=" + pinNo + "]";
	}
	

}
