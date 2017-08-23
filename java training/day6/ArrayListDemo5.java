import java.util.*;

class ArrayListDemo5{

	public static void main(String[] s) {
	
		List<Integer> numbers = new ArrayList<>(2);
		numbers.add(10); 
		numbers.add(20); 
		numbers.add(6); 
		numbers.add(80); 


		Iterator<Integer> itr  = numbers.iterator();
		
		while(itr.hasNext()){
			int val = itr.next();
			System.out.println(val);	
		}

		System.out.println("====================");	

		Collections.sort(numbers);

		itr  = numbers.iterator();
		
		while(itr.hasNext()){
			int val = itr.next();
			System.out.println(val);	
		}
			
	}

}