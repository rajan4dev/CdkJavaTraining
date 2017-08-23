import java.util.concurrent.*;

class ExecutorServiceDemo {
		
	public static void main(String[] args){	
			
		//Executor executor =  Executors.newFixedThreadPool(10);
   		//Executor executor = new ThreadPoolExecutor(10,10,0L,TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>());


		//Executor executor =  Executors.newCachedThreadPool();
		//Executor executor = new ThreadPoolExecutor(0,Integer.MAX_VALUE,60L,TimeUnit.SECONDS,new SynchronousQueue<Runnable>());


		//Executor executor =  Executors.newSingleThreadExecutor();
		
		for(int i=0;i<10000;i++){
			executor.execute(new SumTask());
			
		}				
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

