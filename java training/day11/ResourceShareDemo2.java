class ResourceShareDemo2 implements Runnable {

	Thread thread1 = null;
	Thread thread2 = null;
	int i = 10;

	public static void main(String[] args) throws Exception{	
		new ResourceShareDemo2();
		System.out.println("Finish");
	}

	public ResourceShareDemo2() {
		thread1 = new Thread(this);
		thread2 = new Thread(this);
		thread1.start();
		thread2.start();
	}

	public void run(){	
		use();		
	}

	private synchronized void use(){
		System.out.println(i);
		//500 loc
		try{
			Thread.sleep(5000);
		}catch(Exception e){
		}
		i++;
	}
}



