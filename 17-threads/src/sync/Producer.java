package sync;

public class Producer implements Runnable {
	private SyncStack theStack;
	private int num;
	private static int counter=1;
	
	public Producer(SyncStack s) {
		theStack =s;
		num=counter++;
		
	}

	@Override
	public void run() {
		char c;
		for (int i=0; i<200;i++) {
			c=(char)(Math.random()*26+'A');//randomly pick a char from A to Z
			theStack.push(c); //push the random char to stack
			System.out.println("Producer "+num+": "+c);
			
			try {
				Thread.sleep((int) (Math.random()*300));
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
