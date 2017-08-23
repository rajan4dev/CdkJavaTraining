class RunnableDemo4{

	public static void main(String[] args) throws Exception{	
		new RunnableDemo4();
		System.out.println("Finish");
	}

	public RunnableDemo4(){
		Thread thread = new Thread(new Runnable(){ 
			public void run(){
				for(int j=1;j<=10;j++)
					System.out.println("J : "+j);
			}		
		});
		thread.start();
	}
}


