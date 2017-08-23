import java.util.*;

class ArrayListDemo1{

	public static void main(String[] s) {
			
		List list = new ArrayList(5);
	
		list.add(new String("Hello"));
		list.add(new Integer(100));
		list.add(new Double(340.00));
		list.add(new Integer(100));
		list.add(new Integer(100));
		list.add(new Integer(100));
		list.add(new Integer(100));

		System.out.println(list.size());	
			
		//Object it = list.get(1);
		Integer it = (Integer)list.get(1);

		System.out.println(it);	

		list.remove(0);
		System.out.println(list.size());	
		
	}

}