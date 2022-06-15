
public class CircularSinglyLinkedList {

	public void delete() {
		if (head==null) {
			System.out.println("The CSLL does not exist!");
		}else {
			head=null;
			tail.next=null;
			tail=null;
			System.out.println("The CSLL has been deleted.");
		}
	}
	
	public void deleteOneNode(int location) {
		if(head==null) {
			System.out.println("The CSLL does not exist!");
			return;
			
		}else if(location==0) {
			head=head.next;
			tail.next=head;
			size--;
			if(size==0) {
				tail=null;
				head.next=null;
				head=null;
			}
			
		}else if (location>=size) {
			Node tempNode=head;
			for (int i=0;i<size-1;i++) {
				tempNode=tempNode.next;
			}
		if(tempNode==head) {
			head.next=null;
			tail=head=null;
			size--;
			return;
		}
		tempNode.next=head;
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
	
	public void insert(int nodeValue, int location) {
		Node node=new Node();
		node.value=nodeValue;
		node.next=null;
		
		if(head==null) {
			create(nodeValue);
			return;
			
		}else if(location==0) {
			node.next=head;
			head=node;
			tail.next=head;
			
		}else if (location>=size) {
			tail.next=node;
			tail=node;
			tail.next=head;
			
		}else {
			Node tempNode=head;
			int index =0;
			while (index <location-1) {
				tempNode=tempNode.next;
				index++;
				
			}
			node.next=tempNode.next;
			tempNode.next=node;
			
		}
		size++;
		
	}
	public void traverse() {
		if (head!=null) {
			Node tempNode=head;
			for (int i=0;i<size;i++) {
				System.out.print(tempNode.value);
				
				if(i!=size-1) {
					System.out.print("->");
					
				}
				tempNode=tempNode.next;
					
			}
			System.out.println("\n");
		}else {
			System.out.println("\n CSLL does not exist");
		}
	}
	
	public Node create(int nodeValue) {
		head=new Node();
		tail=new Node();
		
		Node node=new Node();
		node.value=nodeValue;
		node.next=node;
		
		head=node;
		tail=node;
		
		size=1;
		return head;
	}
	
	public int size;
	public Node head;
	public Node tail;
	
}
