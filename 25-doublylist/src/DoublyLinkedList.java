
public class DoublyLinkedList {

	public void deleteOneNode(int location) {
		if(head==null) {
			System.out.println("DLL does not exist");
			return;
			
		}else if (location==0) {
			if(size==1) {
				head=null;
				tail=null;
				size--;
				return;
			}else {
				head=head.next;
				head.previous=null;
				size--;
			}
		}else if (location>size) {
			DoublyNode tempNode=tail.previous;
			if(size==1) {
				head=null;
				tail=null;
				size--;
				return;
				
			}else {
				tempNode.next=null;
				tail=tempNode;
				size--;
				
			}
		}else {
			DoublyNode tempNode=head;
			for (int i=0;i<location;i++) {
				tempNode=tempNode.next;
				
			}
			tempNode.next=tempNode.next.next;
			tempNode.next.previous=tempNode;
			size--;
			
		}
	}
	
	public boolean search(int nodeValue) {
		if (head!=null) {
			DoublyNode tempNode=head;
			for (int i=0;i<size;i++) {
				if(tempNode.value==nodeValue) {
					System.out.println("the node is found at location "+i);
					return true;
				}
				tempNode=tempNode.next;
			}
		}
		System.out.println("Node not found");
		return false;
	}
	
	public void insert(int nodeValue,int location) {
		DoublyNode newNode=new DoublyNode();
		newNode.value=nodeValue;
		if(head==null) {
			create(nodeValue);
			return;
		}else if(location==0) {
			newNode.next=head;
			newNode.previous=null;
			head.previous=newNode;
			head=newNode;
		}else if(location>=size) {
			newNode.next=null;
			tail.next=newNode;
			newNode.previous=tail;
			tail=newNode;
		}else {
			DoublyNode tempNode=head;
			int index=0;
			while(index<location-1) {
				tempNode=tempNode.next;
				index++;
			}
			newNode.previous=tempNode;
			newNode.next=tempNode.next;
			tempNode.next=newNode;
			newNode.next.previous=newNode;
		}
		size++;
	}
	
	public void reverse() {
		if (head!=null) {
			DoublyNode tempNode=tail;
			for (int i=0;i<size;i++) {
				System.out.print(tempNode.value);
				if (i!=size-1) {
					System.out.print("<-");
					
				}
				tempNode=tempNode.previous;
			}
		}else {
			System.out.println("The DLL does not exist");
			
		}
		System.out.println("\n");
	}
	
	public void traverse() {
		if (head!=null) {
			DoublyNode tempNode=head;
			for (int i=0;i<size;i++) {
				System.out.print(tempNode.value);
				if (i!=size-1) {
					System.out.print("->");
					
				}
				tempNode=tempNode.next;
			}
		}else {
			System.out.println("The DLL does not exist");
			
		}
		System.out.println("\n");
	}
	
	public DoublyNode create(int nodeValue) {
		head=new DoublyNode();
		
		DoublyNode newNode=new DoublyNode();
		newNode.value=nodeValue;
		newNode.next=null;
		newNode.previous=null;
		
		head=newNode;
		tail=newNode;
		size=1;
		return head;
		
	}
	
	public DoublyNode head;
	public DoublyNode tail;
	public int size;
	
}
