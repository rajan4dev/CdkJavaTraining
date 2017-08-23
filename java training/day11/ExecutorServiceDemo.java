import java.util.concurrent.*;

class ExecutorServiceDemo {
		
	public static void main(String[] args){	
			
		TaskA taskA  = new TaskA();
		Executor executor =  Executors.newFixedThreadPool(5);
		for(int i=0;i<5000;i++){
			executor.execute(taskA);
		}				
	}
}

class TaskA implements Runnable{

	public void run(){
		for(int i=1;i<=10;i++)
			System.out.println("I : "+i);
	}
}

