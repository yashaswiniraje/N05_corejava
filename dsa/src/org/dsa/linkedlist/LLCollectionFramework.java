package org.dsa.linkedlist;
import java.util.*;
public class LLCollectionFramework {

	public static void main(String[] args) {
		LinkedList<String>LL=new LinkedList<String>();
		LL.addFirst("my");
		LL.addFirst("name");
		LL.addFirst("is");
		LL.addLast("yashu");
		System.out.println(LL);
		System.out.println(LL.size());
		for(int i=0;i<LL.size();i++){
			System.out.println(LL.get(i));
		}
		LL.removeFirst();
		LL.removeLast();
		System.out.println(LL);
	}

}
