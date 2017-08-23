import java.util.concurrent.locks.*;

class ResourceShareDemo implements Runnable {

	Thread thread1 = null;
	Thread thread2 = null;
	Lock lock = new ReentrantLock(true);
	int i = 10;

	public static void main(String[] args) throws Exception{	
		new ResourceShareDemo();
		System.out.println("Finish");
	}

	public ResourceShareDemo() {
		thread1 = new Thread(this);
		thread2 = new Thread(this);
		thread1.start();
		thread2.start();
	}

	public void run(){	
		use();		
	}

	private void use(){
		lock.lock();
			System.out.println(i);
			try{
				Thread.sleep(2000);
			}catch(Exception e){
			}
			i++;
		lock.unlock();
	}
}



