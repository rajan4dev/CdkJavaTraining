import java.util.*;
import java.util.stream.*;

class MapperDemo {
		
	public static void main(String[] args){
		userCaseThree();
		userCaseTwo();
		userCaseOne();
	}


	private static void userCaseThree(){

		List<String> names = Arrays.asList("Rani", "Ramu", "Chachu", "Ganshu", "Papa Jon", "Rancho", "Sudhir",
				"Pintu","Jaggu", "Chandu", "Gabbar", "Lalu Yadav", "Kalia Khatarnak", "Kallu Don", "Rani Patiala",
				"Rose Gulabi", "Laden Humble", "Dawood Raja");

		
		names.stream()
			//.map((name)-> name.length())
			//.filter((name)-> name.length() >= 6)
			//.map((name)-> name.substring(1,6))
			.map((name)-> "Mr. "+name)
			.forEach((val)->{System.out.println("Length : "+val);});

	}


	private static void userCaseTwo(){


		List<Integer> numbers = Arrays.asList(20,12,6,8,15,50,5,10);
		
		numbers.stream()
			.map((val)-> val*val)
			.map((val)-> val*1000)
			.map((val)-> val-50.00)
			.forEach((val)-> System.out.println("Value : "+val));

	}


	private static void userCaseOne(){

		List<Integer> numbers = Arrays.asList(20,12,6,8,15,50,5,10);
		
		numbers.stream()
			.map((val)-> val+100)
			.forEach((val)-> System.out.println("Value : "+val));

	}
}

