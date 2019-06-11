package examples;

import org.w3c.dom.Node;

public class SinglyLinkedList {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	
	
	public SinglyLinkedList insertNode(SinglyLinkedList list, int data){
		
		/*Node node = new Node(data);*/
		
		if(list.head == null){
			list.head=new Node(data);
		}else{
			Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            }
            last.next = new Node(data);
		}
		return list;
}
	public SinglyLinkedList traverseList(SinglyLinkedList list){
		
		Node currentNode = list.head;
		
		while(currentNode.next!=null){
			System.out.print(currentNode.data + " ");
			currentNode=currentNode.next;
		}
		
		return list;
	}
	
	public SinglyLinkedList getNodeAtIndex(SinglyLinkedList list, int index){
		
		int count =0;
		Node currentNode = list.head;
		Node prevNode = list.head;
		if(list.head==null){
			System.out.println("Empty list");
		}else{
			while(currentNode.next!=null ){
				if(count==index){
					prevNode.next=currentNode.next;
				}else{
					currentNode= currentNode.next;
					
				}
				count++;
			}
		}
		
		return list;
	}
	
	
	public int size(Node node){
		int size=0;
		
		Node currentNode =  node;
		if(currentNode==null){
			System.out.println("Empty list");
		}else{
			while(currentNode.next!=null){
				size++;
			}
		}
		
		return size;
	}
	
	}
