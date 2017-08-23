import java.util.*;

class ArrayListDemo2{

	public static void main(String[] s) {
		
		List list = new ArrayList(5);
	
		list.add(100);
		list.add(340.00);

		System.out.println(list.size());	

		double i = (Double)list.get(1);			
		System.out.println(i);	
	}

}