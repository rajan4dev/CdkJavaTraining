import java.util.*;
import java.util.stream.*;

class StreamDemo {
		
	public static void main(String[] args){
		
		
		List<String> names = Arrays.asList("Rani", "Ramu", "Chachu", "Ganshu", "Papa Jon", "Rancho", "Sudhir",
				"Pintu","Jaggu", "Chandu", "Gabbar", "Lalu Yadav", "Kalia Khatarnak", "Kallu Don", "Rani Patiala",
				"Rose Gulabi", "Laden Humble", "Dawood Raja");

		
		Stream<String> stream = names.stream();

		//stream.forEach((String name)->{System.out.println(name);});
		//stream.forEach((String name)-> System.out.println(name));
		//stream.forEach((name)-> System.out.println(name));
		
	}
}

