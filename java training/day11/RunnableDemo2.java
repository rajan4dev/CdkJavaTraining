class RunnableDemo2 {
		
	public static void main(String[] args) throws Exception{	
		new RunnableDemo2();
		System.out.println("Finish");
	}

	public RunnableDemo2(){
		Thread thread = new Thread(new TaskA());
		thread.start();
	}
}


class TaskA implements Runnable{

	public void run(){
		for(int j=1;j<=10;j++)
			System.out.println("J : "+j);
	}
}
