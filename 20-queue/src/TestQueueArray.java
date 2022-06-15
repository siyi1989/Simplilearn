public class TestQueueArray {
    public static void main(String[] args) {
        QueueArray queueArray = new QueueArray(3);
        
        queueArray.enQueue(1);
        queueArray.enQueue(2);
        queueArray.enQueue(3);
        
        queueArray.enQueue(4);
        
        System.out.println("the dequeue: " +queueArray.deQueue());
        
        System.out.println("the peek : " + queueArray.peek());
        
    }
}

