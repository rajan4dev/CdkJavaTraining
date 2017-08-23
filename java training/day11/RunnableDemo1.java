class RunnableDemo1 {
		
	public static void main(String[] args) throws Exception{	
		Thread thread = new Thread(new TaskA());
		thread.start();

		System.out.println("Finish");
	}
}


class TaskA implements Runnable{

	public void run(){
		for(int j=1;j<=10;j++)
			System.out.println("J : "+j);
	}
}
