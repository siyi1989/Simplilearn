
public class MyStack {

	int idx=0;
	//char[]data=new char[6]; -> without synchronize, both t1 and t2 can run parallel.
	private char[]data=new char[6];//due to synchronize, this need to be private
	
	//void method return is implied
	//t1
	//stacks have locks and the synchronize word will pass the lock flag once it completes execution/error out
	public void push(char c) {
		synchronized (this) {
		data[idx]=c;
		idx++;
		}
	}
	
	//t2
	//t2 is waiting for t1 to complete so that it can have the lock flag to run its code
	public char pop() {
		synchronized (this) {
		idx --;
		return data[idx];
	}
}

}
