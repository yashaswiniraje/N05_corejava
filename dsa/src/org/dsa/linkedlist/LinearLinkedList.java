package org.dsa.linkedlist;
import java.util.*;
import org.dsa.linkedlist.LinkedListDemo.Node;

public class LinearLinkedList {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}

		}
	Node head=null;
		
	public void creation(){
		int data,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 0 to exit");
		System.out.println("enter data");
		do {
	    data=sc.nextInt();
	    if(data==0) {
	    	break;
	    }
	    Node new_node=new Node(data);
	    if(head==null) {
	    	head=new_node;
	    }
	    else {
	    	new_node.next=head;
	    	head=new_node;
	    }
	   
		}
		while(data!=0);
	    
	}
	public void traverse() {
		Node temp=head;
		if(head==null)
		{
			System.out.println("not exist");
		}
		else 
		{
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}
		
	


	public static void main(String[] args) {
		LinearLinkedList l1=new LinearLinkedList();
		l1.creation();
		l1.traverse();
	}
		

	}



