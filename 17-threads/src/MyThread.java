
//not recommended to extend because of single inheritance, it will not longer be able to extend others
	public class MyThread extends Thread{
	    int i;
	    
	    @Override
	    public void run() {
	        i = 0;
	        while (true) {
	            System.out.println("Hello " + i++);
	            if (i == 5) {
	                break;
	            }
	            
	            try {
	                Thread.sleep(2000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	    
	    public static void main(String[] args) {
	        Thread t = new MyThread();
	        t.start();
	    }
	}
