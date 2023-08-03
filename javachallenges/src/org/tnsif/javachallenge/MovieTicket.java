package org.tnsif.javachallenge;
import java.util.*;
public class MovieTicket {
static void ticket(int age, float st) 
	{   //adult
		if(age>13) {
			if(st>=13.30 && st<17.59) 
				System.out.println("$5.00");
			
			else
				System.out.println("$8.00");
			}
			//children
		else
			if(st>=13.30 && st<=17.59) 
				System.out.println("$2.00");
			
			else
				System.out.println("$4.00");
			}
		
	
		
	
		
public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	int age=s.nextInt();
	float st=s.nextFloat();
	ticket(age,st);
	}

}
