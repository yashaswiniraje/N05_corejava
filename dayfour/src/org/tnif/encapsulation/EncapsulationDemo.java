package org.tnif.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HDFC h=new HDFC();
h.setAccNO(123456789012L);
h.setAccType("current account");
h.setCvvNo(233);
h.setPinNo(1221);
System.out.println(h.getAccNO());
System.out.println(h.getAccType());
System.out.println(h.getCvvNo());
System.out.println(h.getPinNo());



	}

}
