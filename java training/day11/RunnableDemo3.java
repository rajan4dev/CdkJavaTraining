class RunnableDemo3 implements Runnable{
		
	public void run(){
		for(int j=1;j<=10;j++)
			System.out.println("J : "+j);
	}

	public static void main(String[] args) throws Exception{	
		new RunnableDemo3();
		System.out.println("Finish");
	}

	public RunnableDemo3(){
		Thread thread = new Thread(this);
		thread.start();
	}
}


