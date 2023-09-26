package com.tnsif.dayfifteen;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
public class ArraylistDemo {

	public static void main(String[] args) {
		List <Integer>intlist= new ArrayList<Integer>();
		
		intlist.add(10);
		intlist.add(15);
		intlist.add(20);
		intlist.add(57);
		intlist.add(30);
		System.out.println(intlist);
		System.out.println("10 present? "+intlist.contains(10));
		Collections.sort(intlist);
		Collections.reverse(intlist);
		System.out.println("sorted : "+intlist);
		System.out.println("reversed : "+intlist);
		intlist.add(2,40);
		System.out.println("add at postion two: "+intlist);
		System.out.println("remove from zero "+intlist.remove(0)); 
		System.out.println("integer at position 0 is removed"+intlist);
		System.out.println("index of '10' : "+intlist.indexOf(10));
		System.out.println("remove element 10 :"+intlist.remove(intlist.indexOf(10)));
		System.out.println(intlist);
		
		/*intlist.clear();
		System.out.println(intlist);
		System.out.println(intlist.isEmpty());*/
		Iterator<Integer> it=intlist.iterator();
		while(it.hasNext())
		{
			int no=it.next();
			System.out.println(no+" : "+no*no);
			
		}
			System.out.println(" ------");
		

	}
	

}
