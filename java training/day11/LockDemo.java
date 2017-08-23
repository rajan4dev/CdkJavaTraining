class LockDemo implements Runnable {

	Thread thread1 = null;
	Thread thread2 = null;
	Greeting greeting = new Greeting();
	
	public static void main(String[] args) throws Exception{	
		new LockDemo();
		System.out.println("Finish");
	}

	public LockDemo() {
		thread1 = new Thread(this);
		thread2 = new Thread(this);
		thread1.start();
		thread2.start();
	}

	public void run(){	
		if(Thread.currentThread() == thread1)
			greeting.hello();		
		if(Thread.currentThread() == thread2)
			greeting.hi();
	}

}


class Greeting{

	public synchronized void hello(){
		System.out.println("Hello.......");
		System.out.println("Hello.......");
		System.out.println("Hello.......");
		System.out.println("Hello.......");
		System.out.println("Hello.......");
		try{
			Thread.sleep(4000);
		}catch(Exception e){}
		System.out.println("Hello.......");
		System.out.println("Hello.......");
		System.out.println("Hello.......");
		System.out.println("Hello.......");
		System.out.println("Hello.......");
		System.out.println("Hello.......");
		System.out.println("Hello.......");
	}

	public synchronized void hi(){
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
