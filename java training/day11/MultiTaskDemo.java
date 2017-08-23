import java.util.concurrent.*;

class MultiTaskDemo {
		
	public static void main(String[] args) throws Exception{	
		TaskA taskA  = new TaskA();
		TaskB taskB  = new TaskB();
		System.out.println("11111111111111111111");

		BlockingQueue<Runnable> taskQueue = new ArrayBlockingQueue<>(5);
		taskQueue.put(taskA);
		taskQueue.put(taskB);
		taskQueue.put(taskB);
		taskQueue.put(taskB);
		taskQueue.put(taskB);
		System.out.println("222222222222222222");
		//taskQueue.put(taskB);
		System.out.println("3333333333333333333");

		Worker worker = new Worker(taskQueue);
		worker.start();

		System.out.println("Finish");
	}
}

class Worker extends Thread{
	
	BlockingQueue<Runnable> taskQueue = null;

	public Worker(BlockingQueue<Runnable> taskQueue){
		this.taskQueue = taskQueue ;
	}

	public void run() {
		
		while(true){
			try{
				Runnable task = taskQueue.take();				
				task.run();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	
	}	

}


class TaskA implements Runnable{

	public void run(){
		for(int i=1;i<=10;i++)
			System.out.println("I : "+i);
	}
}

class TaskB implements Runnable{

	public void run(){
		for(int j=1;j<=10;j++)
			System.out.println("J : "+j);
	}
}
