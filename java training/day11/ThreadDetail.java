class ThreadDetail {
		
	public static void main(String[] args){	

		Thread th = Thread.currentThread();
		System.out.println(th.getName());
		System.out.println(th.getPriority());
		System.out.println(th.getThreadGroup().getName());

		TaskA taskA  = new TaskA();
		
		ThreadGroup tg = new ThreadGroup("Group Lazy");
			
	
		//Thread threadA = new Thread(taskA);
		//Thread threadA = new Thread(tg,taskA);
		//Thread threadA = new Thread(taskA,"Print Thread");
		Thread threadA = new Thread(tg,taskA,"Print Thread");

		//threadA.setName("Print Thread");
		//threadA.setPriority(10);
		

		System.out.println(threadA.getName());
		System.out.println(threadA.getPriority());
		System.out.println(threadA.getThreadGroup().getName());
		threadA.start();
		/*try{
			threadA.sleep(5000);
		}catch(InterruptedException e){
		}*/
		System.out.println("Finish");
	}
}


class TaskA implements Runnable{

	public void run(){
		try{
			Thread.currentThread().sleep(5000);
		}catch(InterruptedException e){
		}

		for(int i=1;i<=10;i++)
			System.out.println("I : "+i);
	}
}

