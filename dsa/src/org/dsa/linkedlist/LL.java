package org.dsa.linkedlist;

public class LL {
	static int size;
	LL(){
		this.size=0;
	}
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    Node head; // Declare head as an instance variable

    // Add first
    void add_first(int data) {
    	
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            return;
        }
        new_node.next = head;
        head = new_node;
    }
    //add last
    void add_last(int data) {
    	Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            return;
        }
       Node curnode=head;
       while(curnode.next!=null) {
    	   curnode=curnode.next;
       }
    	   curnode.next=new_node;
    	
    }
  //delete first
    public void delete_first(){
    	size--;
    	head=head.next;
    	
    }
    public void delete_last(){
    	size--;
    	if(head.next==null) {
    		head=null;
    		return;
    	}
    	
    	 Node secondLast=head;
      	 Node Lastnode=head.next;
      	 while(Lastnode.next!=null) {
      		 Lastnode=Lastnode.next;
      		 secondLast=secondLast.next;
      		 
      	 }
      	 secondLast.next=null;
      	 
      	
    }
    //size
    public int getsize() {
    	return size;
    }
    //print
    public void printlist()
    {
    Node current = head;
    while (current != null) {
        System.out.print(current.data);
        System.out.println();
        current = current.next;
    }
    
}
    
   
    public static void main(String[] args) {
        LL list = new LL();

        // Test adding elements to the linked list
        list.add_first(10);
        list.add_first(20);
        list.add_first(30);
        list.add_last(40);
        System.out.println("list:");
        list.printlist();
        list.delete_first();
        list.delete_last();
        list.add_last(90);
        System.out.println("after del");
        list.printlist();
        
        System.out.println(list.getsize());

    }    
       
}
