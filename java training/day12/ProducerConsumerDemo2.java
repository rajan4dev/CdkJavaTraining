import java.util.*;
import java.util.concurrent.*;

class ProducerConsumerDemo2 {
		
	public static void main(String[] args){	
		new ProducerConsumerDemo2();	
	}
	
	public ProducerConsumerDemo2() {

		BlockingQueue<Integer> taskQueue = new LinkedBlockingQueue<>();
		Producer producer = new Producer(taskQueue);
		Consumer consumer = new Consumer(taskQueue);
		new Thread(producer).start();
		new Thread(consumer).start();
	}
}

class Producer implements Runnable{

	BlockingQueue<Integer> taskQueue = null;

	public Producer(BlockingQueue<Integer> taskQueue){
		this.taskQueue = taskQueue;
	}

	public void run(){
		while(true){
			try{
				int value = (int)(Math.random()*1000);
				this.taskQueue.put(value);
				System.out.printf("Data Size : %d%n",this.taskQueue.size());
				TimeUnit.SECONDS.sleep(3);
			}catch(InterruptedException e){
			}
		}
	}
}


class Consumer implements Runnable{

	BlockingQueue<Integer> taskQueue = null;

	public Consumer(BlockingQueue<Integer> taskQueue){
		this.taskQueue = taskQueue;
	}

	public void run(){
		while(true){
			try{
				int value = this.taskQueue.take();			
				System.out.printf("Consumed : %d%n",value);
				TimeUnit.SECONDS.sleep(2);
			}catch(InterruptedException e){
			}
		}
	}
}
