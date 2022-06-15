
public class DriverCSLL {

	public static void main(String[] args) {
		
		CircularSinglyLinkedList linkedList=new CircularSinglyLinkedList();
		
		linkedList.create(7);
		linkedList.traverse();
		
		linkedList.insert(10,0);
		linkedList.traverse();
		
		linkedList.insert(20,2);
		linkedList.traverse();
		
		linkedList.insert(30,1);
		linkedList.traverse();
		
		linkedList.search(7);
		
		
	}

}
