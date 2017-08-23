class LoopDemo {
		
	public static void main(String[] args){	
		TaskA taskA  = new TaskA();
		TaskB taskB  = new TaskB();

		Thread threadA = new Thread(taskA);
		threadA.start();

		Thread threadB = new Thread(taskB);
		threadB.start();

		System.out.println("Finish");
	}
}

class TaskA implements Runnable{

	public void run(){
		for(int i=1;i<=10;i++)
			System.out.println("I : "+i);
	}
}

class TaskB implements Runnable{

	public void run(){
		for(int j=1;j<=10;j++)
			System.out.println("J : "+j);
	}
}
