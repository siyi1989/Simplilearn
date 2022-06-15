
public class QueueArray {
	
	public int deQueue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
			
		}else {
			int result=arr[beginningOfQueue];
			beginningOfQueue++;
			if(beginningOfQueue>topOfQueue) {
				beginningOfQueue=topOfQueue=-1;
				
			}return result;
		}
	}
	public void enQueue(int value) {
		if(isFull()) {
			System.out.println("Queue is full");
			
		}else if(isEmpty()) {
			beginningOfQueue=0;
			topOfQueue++;
			arr[topOfQueue]=value;
			System.out.println("Successfully inserted"+value);
		}else {
			topOfQueue++;
			arr[topOfQueue]=value;
			System.out.println("Successfully inserted"+value);
		}
	}
	public int peek() {
		if(!isEmpty()) {
			return arr[beginningOfQueue];
		}else {
			System.out.println("Queue is empty");
			return -1;
		}
	}
	
	public boolean isFull() {
		if(topOfQueue==arr.length-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isEmpty() {
        if ( ( beginningOfQueue == -1) || (beginningOfQueue == arr.length)) {
            return true;
        }else {
            return false;
        }
    }

	
	public QueueArray(int size) {
		
		this.arr=new int[size];
		this.topOfQueue=-1;
		this.beginningOfQueue=-1;
		System.out.println("Queue is successfully created");
	}

	
	int[] arr;
	int topOfQueue;
	int beginningOfQueue;
	
}
