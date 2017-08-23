import java.util.*;

class ArrayListDemo3{

	public static void main(String[] s) {
	
		List<Integer> numbers = new ArrayList<>(2);
		numbers.add(10); 
		numbers.add(20); 

		Integer it = numbers.get(0);
		int i = numbers.get(0);
		
		List<String> names = new ArrayList<>(5);
	
		names.add("Jaggu");
		names.add("Ghanshu");
	
		System.out.println(names.size());	
		
		String str = names.get(0);
		System.out.println(str);	
		
	}

}