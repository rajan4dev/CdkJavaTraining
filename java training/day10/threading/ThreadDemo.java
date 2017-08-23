class ThreadDemo {
		
	public static void main(String[] args){	
		HelloThread hello  = new HelloThread();
		HiThread hi  = new HiThread();
		hello.start();
		hi.start();
		System.out.println("Done");
		System.out.println("Done");
		System.out.println("Done");
		System.out.println("Done");
	}


}

class HelloThread extends Thread{

	public void run(){
		 System.out.println("Hello");
		 System.out.println("Hello");
		 System.out.println("Hello");
		 System.out.println("Hello");
	}
}

class HiThread extends Thread{

	public void run(){
		 System.out.println("Hi");
		 System.out.println("Hi");
		 System.out.println("Hi");
		 System.out.println("Hi");
	}

}
