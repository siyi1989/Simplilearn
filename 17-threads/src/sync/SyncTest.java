package sync;

public class SyncTest {

	public static void main(String[] args) {
		
		SyncStack stack =new SyncStack();
		Producer p=new Producer(stack);
		Thread t1=new Thread(p);
		t1.start();
		
		Consumer c=new Consumer(stack);//using same stack as producer
		Thread t2=new Thread(c);
		t2.start();	

	}

}
