package sync;

import java.util.ArrayList;
import java.util.List;

public class SyncStack {

	private List<Character> buffer = new ArrayList<Character>();
	
	//wait for notification on block flag
	//if size is 0, nothing to remove therefore wait for push
	public synchronized char pop() {
		char c;
		
		while (buffer.size()==0) {

			try {
				this.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		c=buffer.remove(buffer.size()-1);
		return c;
		
	}
	//notifies
	public synchronized void push(char c) {
		this.notify();
		buffer.add(c);
		
	}
	
}
