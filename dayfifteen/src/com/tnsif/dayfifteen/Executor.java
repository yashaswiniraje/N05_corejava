package com.tnsif.dayfifteen;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
//program to demonstrate heterogeneous list
public class Executor {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	@SuppressWarnings("rawtypes")
	List listone = new ArrayList();
	listone.add(10);
	listone.add(true);
	listone.add(34.78f);
	listone.add("Hello");
	listone.add(new String("Hi"));
	System.out.println(listone);
	Collections.sort(listone);
	//ClassCastException
	
	}

}
