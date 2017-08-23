class LoopDemo {
		
	public static void main(String[] args){	
		ThreadA threadA  = new ThreadA();
		ThreadB threadB  = new ThreadB();
		threadA.start();
		threadB.start();
		System.out.println("Finish");
	}
}

class ThreadA extends Thread{

	public void run(){
		for(int i=1;i<=10;i++)
			System.out.println("I : "+i);
	}
}

class ThreadB extends Thread{

	public void run(){
		for(int j=1;j<=10;j++)
			System.out.println("J : "+j);
	}
}
