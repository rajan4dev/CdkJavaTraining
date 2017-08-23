import java.util.concurrent.*;

class CallableDemo {
		
	public static void main(String[] args){	
			
		ExecutorService executor =  Executors.newFixedThreadPool(10);
		Future<Integer> future = executor.submit(new SumTask());
		
		try{
			future.cancel(true);
			System.out.println("Task cancelled");
			if(!future.isCancelled()){
				int rs = future.get();
				System.out.printf("Result : %d%n",rs);
			}
		}catch(InterruptedException e){
			System.out.println("Thread got interrupted!!!");
		}catch(ExecutionException e){
			System.out.println("Task can not be executed!!!");
		}catch(CancellationException e){
			System.out.println("Task already got cancelled!!!");
		}
	}
}

class SumTask implements Callable<Integer>{

	public Integer call(){
		int sum = 0;
		for(int i=1;i<=100;i++)
			sum = sum + i;
		return sum;
	}
}

