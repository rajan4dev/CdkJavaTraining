import java.util.*;

class MapDemo {
		
	public static void main(String[] args){	


		
		Map concurrentMap = new HashMap();
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






