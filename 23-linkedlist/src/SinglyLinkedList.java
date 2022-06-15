
public class SinglyLinkedList {

	
	public void deleteOneNode(int location) {
		if(head==null) {
			System.out.println("The SLL does not exist!");
			return;
			
		}else if(location==0) {
			head=head.next;
			size--;
			if(size==0) {
				tail=null;
			}
			
		}else if (location>=size) {
			Node tempNode=head;
			for (int i=0;i<size-1;i++) {
				tempNode=tempNode.next;
			}
		if(tempNode==head) {
			tail=head=null;
			size--;
			return;
		}
		tempNode.next=null;
		tail=tempNode;
		size--;
	}else {
		Node tempNode=head;
		for (int i=0;i<location-1;i++) {
			tempNode=tempNode.next;
		}
		tempNode.next=tempNode.next.next;
		size--;
	}
	}
		
	public void delete() {
		head=null;
		tail=null;
		System.out.println("the singly linked list is deleted");
	}
	public boolean search(int nodeValue) {
		if(head != null) {
			Node tempNode=head;
			for (int i=0;i<size;i++) {
				if(tempNode.value==nodeValue) {
					System.out.println("Found node at location:"+i+"\n");
					return true;
				}
				tempNode=tempNode.next;
				
			}
		}
		System.out.println("Node not found");
		return false;
	}
	
	public void insert (int nodeValue,int location) {
		Node node=new Node();
		node.value=nodeValue;
		
		if (head==null) {
			create(nodeValue);
			return;
		}else if(location==0) {//beginning
			node.next=head;
			head=node;
			
		}else if(location>=size) {//end
			node.next=null;
			tail.next=node;
			tail=node;
			
		}else {
			Node tempNode=head;
			int index=0;
			while(index<location-1) {
				tempNode=tempNode.next;
				index++;
			}
			Node nextNode=tempNode.next;
			tempNode.next=node;
			node.next=nextNode;
		}
		size++;
		return;
	}
	
	
	
	public void traverse() {
		if (head==null) {
			System.out.println("SLL does not exist!");
		}else {
			Node tempNode=head;
			for (int i=0;i<size;i++) {
				System.out.println(tempNode.value);
				if(i!= size-1) {
					System.out.println("->");
				}
				tempNode=tempNode.next;
			}
		}
		System.out.println("\n");
	}
	public Node create (int nodeValue) {
		head=new Node();
		tail=new Node();
		
		//create new Node
		Node node=new Node();
		//set data
		node.value=nodeValue;
		//set link
		node.next=null;
		
		head=node;
		tail=node;
		size=1;
		return head;
		
		
		
	}
	
	
public Node head;
public Node tail;
public int size;
}
