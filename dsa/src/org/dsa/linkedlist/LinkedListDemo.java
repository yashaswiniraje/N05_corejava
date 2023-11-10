package org.dsa.linkedlist;
import java.util.Scanner;
public class LinkedListDemo {
static class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
		
	}
Node head=null;
 public void creation() {
	 int data,n;
	 Scanner sc=new Scanner(System.in);
	 do {
	 System.out.println("enter data");
	 data=sc.nextInt();
	 Node new_node=new Node(data);
	 if(head==null) {
		 head=new_node;
		 
	 }
	 else {
		 new_node.next=head;
		 head=new_node;
	 }
	 System.out.println("if want to enter more data press 1");
	 n=sc.nextInt();
	 }
	 while(n==1);
			
		}
 public void traverser() {
	 Node temp=head;
	 if(head==null)
	 {
		 System.out.println("liked list not exist");
	 }
	 else {
		 while(temp!=null) {
			 System.out.println(temp.data);
		 temp=temp.next;
		 }
	 }
	 
 }
		public static void main(String[] args) {
			LinkedListDemo l = new LinkedListDemo();
			l.creation();
			l.traverser();
		}

}
