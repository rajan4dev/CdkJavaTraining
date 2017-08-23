import java.util.*;

class ArrayListDemo4{

	public static void main(String[] s) {
	
		List<Integer> numbers = new ArrayList<>(2);
		numbers.add(10); 
		numbers.add(20); 
		numbers.add(6); 
		numbers.add(80); 

		for(int idx=0;idx<numbers.size();idx++){
			System.out.println(numbers.get(idx));	
		}

		for(int val : numbers){
			System.out.println(val);	
		}

		Iterator<Integer> itr  = numbers.iterator();
		
		while(itr.hasNext()){
			int val = itr.next();
			System.out.println(val+100);	
		}
			
	}

}