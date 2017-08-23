import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

class AtomicDemo {

	AtomicInteger it = new AtomicInteger(10);
		
	public static void main(String[] args){	
		new AtomicDemo();	
	}
	
	public AtomicDemo() {

		new Thread(()->{
			System.out.println(it.incrementAndGet());	
		}).start();
		
		new Thread(()->{
			System.out.println(it.incrementAndGet());	
		}).start();
	}
}

