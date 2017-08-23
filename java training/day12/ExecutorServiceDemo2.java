import java.util.concurrent.*;

class ExecutorServiceDemo2 {
		
	public static void main(String[] args){	
			
		ExecutorService executor =  Executors.newFixedThreadPool(10);
		
		for(int i=0;i<100;i++){
			//executor.execute(new SumTask());
			executor.submit(new SumTask());
		}

		executor.shutdown(); 
		System.out.println(executor.isShutdown());

		//executor.shutdownNow(); 
	}
}

class SumTask implements Runnable{

	public void run(){
		int sum = 0;
		for(int i=1;i<=500;i++)
			sum = sum + i;
		/*try{
			TimeUnit.SECONDS.sleep(2);
		}catch(InterruptedException e){}*/
		System.out.printf("SUM is %s%n",sum);
	}
}

