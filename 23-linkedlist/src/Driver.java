
public class Driver {

	public static void main(String[] args) {
		SinglyLinkedList linkedList=new SinglyLinkedList();
		linkedList.create(7);
		linkedList.traverse();
		
		linkedList.insert(10, 0);
		linkedList.traverse();
		
		linkedList.insert(20,5);
		linkedList.traverse();
		
		linkedList.insert(40,2);
		linkedList.traverse();
		
		linkedList.search(7);
		linkedList.search(777);
		
		linkedList.deleteOneNode(2);
		linkedList.traverse();
	}

}
