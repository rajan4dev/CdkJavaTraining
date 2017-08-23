import java.util.*;

class SetDemo2{

	public static void main(String[] s) {
			
		Set<String> names = new TreeSet<>();	
		names.add("Raghu");		
		names.add("Pintu");		
		names.add("Chandu");		
		names.add("Jaggu");		
		names.add("Kalia");		
		names.add("Pintu");		

		System.out.println("==========================");	

		Iterator<String> itr  = names.iterator();
		
		while(itr.hasNext()){
			String val = itr.next();
			System.out.println(val);	
		}
		
	}

}