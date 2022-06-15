
public class DriverDLL {

	public static void main(String[] args) {
		DoublyLinkedList linkedList=new DoublyLinkedList();
		linkedList.create(7);
		linkedList.traverse();
		
		linkedList.insert(10,0);
		linkedList.traverse();
		
		linkedList.insert(20,3);
		linkedList.reverse();
		
		linkedList.search(10);
		
		linkedList.deleteOneNode(0);
		linkedList.traverse();
		
	}

}
