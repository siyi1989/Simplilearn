
public class Stack {

	int[] arr;
	int topOfStack;
	

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}else {
			return arr[topOfStack];
		}
	}
	
	public int pop() {
		if (isEmpty()) {
			System.out.println("stack is empty");
			return -1;
			
		}else {
			int topStack=arr[topOfStack];
			topOfStack--;
			return topStack;
		}
	}
	public void push(int value) {
		if (isFull()) {
			System.out.println("stack is full");
			
		}else {
			arr[topOfStack+1]=value;
			topOfStack++;
			System.out.println("value is successfully inserted");
			
		}
	}
	public boolean isFull() {
		if(topOfStack==arr.length-1) {
			return true;
		}else {
			return false;
		}
	}
	public boolean isEmpty() {
		if(topOfStack==-1) {
			return true;
		}else {
			return false;
		}
	}
	public Stack(int size) {
		this.arr=new int[size];
		this.topOfStack=-1;
		System.out.println("the stack is created with size of:"+size);
		
	}
}
