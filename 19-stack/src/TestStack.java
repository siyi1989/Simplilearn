
public class TestStack {

	public static void main(String[] args) {
		Stack stack=new Stack(3);
		System.out.println("Peek:"+stack.peek());
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);//error exceed size of stack
		
		System.out.println("Popped: "+stack.pop());
		System.out.println("Peek:"+stack.peek());
		

	}

}
