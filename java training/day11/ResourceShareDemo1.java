class ResourceShareDemo implements Runnable{
	Thread thread1 = null;
	Thread thread2 = null;
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
		
		if(Thread.currentThread()  == thread1){
			for(int count =0 ;count <10;count++){
				System.out.println(i);
				i++;
			}
		}
		if(Thread.currentThread()  == thread2){
			for(int count =0 ;count <10;count++){
				System.out.println(i);
				i++;
			}
		}
	}
}



