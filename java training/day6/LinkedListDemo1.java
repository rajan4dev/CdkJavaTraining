import java.util.*;

class LinkedListDemo1{

	public static void main(String[] s) {
	
		LinkedList<Integer> numbers = new LinkedList<>();
		numbers.add(10); 
		numbers.add(20); 
		numbers.add(6); 
		numbers.add(80); 

		numbers.addLast(12); 
		System.out.println(numbers.removeFirst()); 
	
		System.out.println(numbers.get(2)); 

		numbers.addFirst(90000); 
		System.out.println(numbers.removeLast()); 
	

		Iterator<Integer> itr  = numbers.iterator();
		
		while(itr.hasNext()){
			int val = itr.next();
			System.out.println(val);
			itr.remove();	
		}

		System.out.println(numbers.size()); 

			
	}

}