import java.util.concurrent.*;
import java.util.*;

class ConcurrentMapDemo {
		
	public static void main(String[] args){	


		
		ConcurrentMap concurrentMap = new ConcurrentHashMap();
		concurrentMap.put("A",100);
		concurrentMap.put("B",200);
		concurrentMap.put("C",300);

		Iterator itr = concurrentMap.entrySet().iterator();
		System.out.println(itr.next());
		System.out.println(itr.next());

		concurrentMap.remove("C");

		System.out.println(itr.next());
		
	
	}
}






