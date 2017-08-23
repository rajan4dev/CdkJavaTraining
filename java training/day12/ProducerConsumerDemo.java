import java.util.*;
import java.util.concurrent.*;

class ProducerConsumerDemo {
		
	public static void main(String[] args){	
		new ProducerConsumerDemo();	
	}
	
	public ProducerConsumerDemo() {

		List<Integer> taskQueue = Collections.synchronizedList(new LinkedList<Integer>());
		Producer producer = new Producer(taskQueue);
		Consumer consumer = new Consumer(taskQueue);
		new Thread(producer).start();
		new Thread(consumer).start();
	}
}

class Producer implements Runnable{

	List<Integer> taskQueue = null;

	public Producer(List<Integer> taskQueue){
		this.taskQueue = taskQueue;
	}

	public void run(){
		while(true){
			if(this.taskQueue.isEmpty()){
				int value = (int)(Math.random()*1000);
				this.taskQueue.add(value);
				System.out.printf("Data Size : %d%n",this.taskQueue.size());
				try{
					TimeUnit.SECONDS.sleep(3);
				}catch(InterruptedException e){}
			}
		}
	}
}


class Consumer implements Runnable{

	List<Integer> taskQueue = null;

	public Consumer(List<Integer> taskQueue){
		this.taskQueue = taskQueue;
	}

	public void run(){
		while(true){
			if(!this.taskQueue.isEmpty()){
				int value = this.taskQueue.remove(0);			
				System.out.printf("Consumed : %d%n",value);
				try{
					TimeUnit.SECONDS.sleep(2);
				}catch(InterruptedException e){}
			}
		}
	}
}
