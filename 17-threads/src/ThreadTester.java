
public class ThreadTester {

	//main thread
	public static void main(String[] args) {
		HelloRunner target =new HelloRunner();
		//multi-threaded-->from one runnable instance (target is the same)
		//sharing the same data and core
		//below child thread=total 1 main +2 child=3 thread
		Thread t1=new Thread(target);
		t1.start();
		//Thread t2=new Thread(target);
		//t2.start();
		
		//t1.join();-->halted until all other thread finish running then this will join up
		
		
	
		
	}

}

//below class is capable of extending other class unlike MyThread code
class HelloRunner implements Runnable{
	int i;
	//child thread
	@Override
	public void run() {
		i=0;
		while(true) {
			System.out.println("Hello "+i++);
			if (i==5) {
				break;
			}
			
			//example of blocked thread
			try{
				
				Thread.sleep(2000);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
				
			}
		}
		
		
	}
}