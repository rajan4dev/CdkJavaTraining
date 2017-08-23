class RunnableDemo5{

	public static void main(String[] args) throws Exception{	
		new RunnableDemo5();
		System.out.println("Finish");
	}

	public RunnableDemo5() {
		Thread thread1 = new Thread(()-> System.out.println("Hello ji"));
		thread1.start();

		Thread thread2 = new Thread(()-> {
				for(int j=1;j<=10;j++)
					System.out.println("J : "+j);
		});
		thread2.start();

		new Thread(()-> {
				for(int j=1;j<=10;j++)
					System.out.println("J : "+j);
		}).start();

	}
}


