class ResourceShareDemo3 implements Runnable {

	Thread thread1 = null;
	Thread thread2 = null;
	
	public static void main(String[] args) throws Exception{	
		new ResourceShareDemo3();
		System.out.println("Finish");
	}

	public ResourceShareDemo3() {
		thread1 = new Thread(this);
		thread2 = new Thread(this);
		thread1.start();
		thread2.start();
	}

	public void run(){	
		if(Thread.currentThread() == thread1)
			this.hello();		
		if(Thread.currentThread() == thread2)
			this.hi();
	}

	private synchronized void hello(){
		System.out.println("Hello.......");
		System.out.println("Hello.......");
		System.out.println("Hello.......");
		try {
			Thread.sleep(10000);
		}catch(Exception e){}
		System.out.println("Hello.......");
		System.out.println("Hello.......");
		System.out.println("Hello.......");
		System.out.println("Hello.......");
		System.out.println("Hello.......");
		System.out.println("Hello.......");
		System.out.println("Hello.......");
		System.out.println("Hello.......");
		System.out.println("Hello.......");
	}

	private void hi(){
		
		synchronized(this){
			System.out.println("Hi.......");
			System.out.println("Hi.......");
			System.out.println("Hi.......");
			System.out.println("Hi.......");
			System.out.println("Hi.......");
			System.out.println("Hi.......");
			System.out.println("Hi.......");
			System.out.println("Hi.......");
			System.out.println("Hi.......");
			System.out.println("Hi.......");
			System.out.println("Hi.......");
			System.out.println("Hi.......");
		}
	}
}



