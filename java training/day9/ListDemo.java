import java.util.*;
import java.util.function.*;

class ListDemo {
		
	public static void main(String[] args){
		
		/*Greeting greeting = (String name) -> { System.out.printf("Hello  : %s%n",name);  };
		greeting.greet("Jagga");
		*/

		List<String> names = Arrays.asList("Rani", "Ramu", "Chachu", "Ganshu", "Papa Jon", "Rancho", "Sudhir",
				"Pintu","Jaggu", "Chandu", "Gabbar", "Lalu Yadav", "Kalia Khatarnak", "Kallu Don", "Rani Patiala",
				"Rose Gulabi", "Laden Humble", "Dawood Raja");

		//Consumer<String> consumer = (String name) -> { System.out.printf("Hello  : %s%n",name);  };
		Greeting<String> consumer = (String name) -> { System.out.printf("Hello  : %s%n",name);  };
	
		names.forEach(consumer);
	
		names.forEach((String name)-> { System.out.printf("Hello  : %s%n",name); });

		names.forEach((String name)-> { System.out.printf("Hi  : %s%n",name); });

		names.forEach((String name)-> { System.out.printf("Bye  : %s%n",name); });

		names.forEach((String name)-> { System.out.printf("Length of  %s is %s%n",name,name.length()); });

		names.forEach((String name)-> { System.out.printf("Length of  %s%n",name.toUpperCase()); });

		names.forEach((String name)-> { System.out.printf("Length of  %s%n",name.toLowerCase()); });

		names.forEach((String name)-> { System.out.printf("Length of  %s%n",name.substring(2,4)); });
	}
}

interface Greeting<T> extends Consumer<T>{
}

/*interface Greeting{
	void greet(String name);
}*/