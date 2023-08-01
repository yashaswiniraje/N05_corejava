package org.tnsif.javachallenge;
import java.util.*;
public class MIcrowaveHeatingTime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int items=sc.nextInt();
		float ht=sc.nextFloat();
		switch(items) {
		case 1:
			System.out.println(ht);
			break;
		case 2:
			System.out.println((ht/2)+ht);
			break;
		case 3:
			System.out.println(2*ht);
		break;
		default:
			System.out.println("not recomended");
		
		}
	}

}
